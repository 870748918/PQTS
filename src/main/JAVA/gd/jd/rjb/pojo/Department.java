package gd.jd.rjb.pojo;

import javax.enterprise.inject.Model;

/**
 * Created by 黑夜丶风筝 on 2017/11/09 0009.
 */
@Model
public class Department {
    private String depID;//部门编号
    private String depName;//部门名称
    private String depAdress;//部门地址
    private String memo;//备注
    private User user;//部门负责人信息

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepAdress() {
        return depAdress;
    }

    public void setDepAdress(String depAdress) {
        this.depAdress = depAdress;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
