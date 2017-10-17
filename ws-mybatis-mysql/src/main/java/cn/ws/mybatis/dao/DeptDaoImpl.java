package cn.ws.mybatis.dao;

import cn.ws.mybatis.entities.Dept;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by ShuangWang on 2017/10/17.
 */
@Repository
public class DeptDaoImpl {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 根据部门编号查询部门信息
     * @param deptId 部门编号
     * @return 部门信息
     */
    public Dept selectDept(Integer deptId){
        Dept dept=	sqlSessionTemplate.selectOne("DeptMapper.selectDept", deptId);
        return dept;
    }
    /**
     * 添加部门信息
     * @param dept 部门信息
     * @return 添加成功的记录数
     */
    public int insertDept(Dept dept){
        System.out.println("------dao.dept:"+dept);
        return sqlSessionTemplate.insert("DeptMapper.insertDept", dept);
    }

}
