package com.jike.usermanage.service;


import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User updateUser(User user) throws UserNotFound {
		User userUpdate = userRepository.findOne(user.getId());
		if (userUpdate==null)
			throw new UserNotFound();
		if (user.getName()!=null)
			userUpdate.setName(user.getName());
		if (user.getAddress()!=null)
			userUpdate.setAddress(user.getAddress());
		if (user.getPhone()!=null)
			userUpdate.setPhone(user.getPhone());
		userRepository.save(userUpdate);
		return userUpdate;
	}

	@Override
	public User deleteUser(int id) throws UserNotFound {
		User userDelete = userRepository.findOne(id);
		if (userDelete==null)
			throw new UserNotFound();
		userRepository.delete(userDelete);
		return userDelete;
	}

	@Override
	public User getUser(int id) {

		return userRepository.findOne(id);
	}

	@Override
	public List<User> getUsers() {

		return userRepository.findAll();
	}

	@Override
	public Page<User> getUsersByConditionWithPage(String phone, String address, Integer page, Integer pageSize) {
		
		
        //������
		Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize));
		
		//����
		
		//��һ������ʽ
		//Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize,new Sort(Direction.ASC,"name","phone")));

		//�ڶ�������ʽ
        //Order order = new Order(Direction.ASC,"phone");
		//Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize,new Sort(order));		

		//����������ʽ
        //List<Order> orders = new ArrayList<Order>();
        //orders.add(new Order(Direction.DESC,"name"));
        //orders.add(new Order(Direction.ASC,"phone"));
		//Page<User> userPage = userRepository.findByPhoneStartingWithAndAddressContaining(phone,address,new PageRequest(page, pageSize,new Sort(orders));

        return userPage;
		
	}

	@Override
	public List<User> getUsersByConditionNoPage(String phone,String address) {
		
		return userRepository.findTop2ByPhoneStartingWithAndAddressContainingOrderByPhoneDesc(phone, address);

		//return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(Direction.ASC,"phone"));

		//Order order = new Order(Direction.ASC,"phone");
		//return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(order));

		//List<Order> orders = new ArrayList<Order>();
		//orders.add(new Order(Direction.DESC,"name"));
		//orders.add(new Order(Direction.ASC,"phone"));		
		//return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(orders);
		
	}


}
