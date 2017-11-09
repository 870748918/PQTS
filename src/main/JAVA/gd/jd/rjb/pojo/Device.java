package gd.jd.rjb.pojo;

import javax.enterprise.inject.Model;

/**
 * Created by 黑夜丶风筝 on 2017/11/09 0009.
 */
@Model
public class Device {
    private String DevID;//设备ID
    private String devName;//设备名称
    private String depID;//归属部门编号
    private String buyTime;//购买时间
    private String price;//设备价格
    private String provider;//供货商名称
    private String memo;//备注

}
