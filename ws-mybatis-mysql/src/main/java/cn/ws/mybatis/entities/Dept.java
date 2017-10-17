package cn.ws.mybatis.entities;

import java.io.Serializable;

/**
 * Created by ShuangWang on 2017/10/17.
 */
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;
    private String deptAddress;
    public Integer getDeptId() {
        return deptId;
    }
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptAddress() {
        return deptAddress;
    }
    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
    @Override
    public String toString() {
        return "Dept [deptId=" + deptId + ", deptName=" + deptName
                + ", deptAddress=" + deptAddress + "]";
    }
}
