package gd.jd.rjb.pojo;

import javax.enterprise.inject.Model;
import java.util.List;

/**
 * Created by 黑夜丶风筝 on 2017/11/09 0009.
 */
@Model
public class User {
    private String userID;//员工编号
    private String userName;//员工姓名
    private String depID;//部门编号
    private String position;//员工职位
    private String telephone;//联系电话
    private String email;//电子邮箱
    private String memo;//备注
    private List<Role> roles;//员工角色

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
