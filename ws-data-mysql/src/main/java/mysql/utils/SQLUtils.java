package mysql.utils;

import java.util.Set;

/**
 * Created by zhaoao.zhang on 19/12/2016.
 */
public class SQLUtils {

    public static String convertIdSetToCondition(Set<String> idSet, String field) {
        if (idSet.size() == 0) {
            return "1";
        } else if (idSet.size() == 1) {
            return field + " = \'" + idSet.toArray()[0] + "\'";
        } else {
            StringBuilder stringBulder = new StringBuilder();
            for (String id : idSet) {
                if (stringBulder.length() == 0) {
                    stringBulder.append("\'" + id + "\'");
                } else {
                    stringBulder.append(", \'" + id + "\'");
                }
            }
            return field + " IN (" + stringBulder.toString() + ")";
        }
    }
}
