package mysql.sql.builders;


import mysql.utils.SQLUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Set;

/**
 * Created by zhaoao.zhang on 19/12/2016.
 */
public abstract class AbstractSqlBulder {

    protected String buildSelectByIdSet(Set<String> idSet, String table, String idField, String fields) {
        String condition = SQLUtils.convertIdSetToCondition(idSet, idField);
        return new SQL().SELECT(fields).FROM("`" + table + "`").WHERE(condition).toString();
    }

    protected String buildSelectByIdSet(Set<String> idSet, String table, String idField) {
        return buildSelectByIdSet(idSet, table, idField, "*");
    }

    protected String buildSelectByIdSet(Set<String> idSet, String table) {
        return buildSelectByIdSet(idSet, table, "id", "*");
    }
}
