package mysql;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by yunwu on 2016/11/15.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MybatisMapper {

}
