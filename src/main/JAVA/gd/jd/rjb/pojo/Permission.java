package gd.jd.rjb.pojo;

import javax.enterprise.inject.Model;

/**
 * Created by 黑夜丶风筝 on 2017/11/09 0009.
 */
@Model
public class Permission {
    private String permissionID;//权限编号
    private String permissionName;//权限名称
    private String memo;//备注

    public String getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(String permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
