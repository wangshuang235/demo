package ws.test.dao;

import mysql.MybatisMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import ws.test.entities.Person;

import java.util.List;

/**
 * Created by ShuangWang on 2017/7/25.
 */
@MybatisMapper
public interface TestMapper {
    @ConstructorArgs({
            @Arg(column = "id", id = true, javaType = String.class),
            @Arg(column = "name", javaType = String.class)
    })
    @Select("SELECT * FROM person")
    List<Person> findAll();

    @Insert("INSERT INTO person(id, name) VALUES(#{id}, #{name})")
    boolean save(Person person);
}
