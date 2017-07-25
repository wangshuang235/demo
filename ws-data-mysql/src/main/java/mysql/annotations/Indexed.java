package mysql.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标明已经添加了关系数据库索引，可以用于查询过滤和排序
 *
 * Created by zhaoao.zhang on 18/11/2016.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Indexed {
}
