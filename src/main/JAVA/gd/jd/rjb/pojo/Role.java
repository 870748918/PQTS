package gd.jd.rjb.pojo;

import javax.enterprise.inject.Model;
import java.util.List;

/**
 * Created by 黑夜丶风筝 on 2017/11/09 0009.
 */
@Model
public class Role {
    private String roleID;//角色编号
    private String roleName;//角色名称
    private String memo;//备注
    private List<Permission> Permissions;//角色拥有的权限

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<Permission> getPermissions() {
        return Permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        Permissions = permissions;
    }
}
