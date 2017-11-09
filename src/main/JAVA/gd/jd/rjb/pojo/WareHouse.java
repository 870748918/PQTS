package gd.jd.rjb.pojo;

import javax.enterprise.inject.Model;

/**
 * Created by 黑夜丶风筝 on 2017/11/09 0009.
 */
@Model
public class WareHouse {
    private String wareID;//仓库编号
    private String wareName;//仓库名称
    private String wareAdress;//仓库地址
    private String loginID;//仓库管理员编号
    private String memo;//备注

    public String getWareID() {
        return wareID;
    }

    public void setWareID(String wareID) {
        this.wareID = wareID;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareAdress() {
        return wareAdress;
    }

    public void setWareAdress(String wareAdress) {
        this.wareAdress = wareAdress;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
