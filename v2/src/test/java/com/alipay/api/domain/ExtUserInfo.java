package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部指定买家
 *
 * @author auto create
 * @since 1.0, 2017-10-09 14:41:18
 */
public class ExtUserInfo extends AlipayObject {

    private static final long serialVersionUID = 7887623923994342754L;

    /**
     * 证件号
     * <p>
     * 注：need_check_info=T时该参数才有效
     */
    @ApiField("cert_no")
    private String certNo;

    /**
     * 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等。如有其它类型需要支持，请与蚂蚁金服工作人员联系。
     * <p>
     * 注： need_check_info=T时该参数才有效
     */
    @ApiField("cert_type")
    private String certType;

    /**
     * 是否强制校验付款人身份信息 T:强制校验，F：不强制
     */
    @ApiField("fix_buyer")
    private String fixBuyer;

    /**
     * 允许的最小买家年龄，买家年龄必须大于等于所传数值 注： 1. need_check_info=T时该参数才有效 2. min_age为整数，必须大于等于0
     */
    @ApiField("min_age")
    private String minAge;

    /**
     * 手机号 注：该参数暂不校验
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 姓名
     * <p>
     * 注： need_check_info=T时该参数才有效
     */
    @ApiField("name")
    private String name;

    /**
     * 是否强制校验身份信息 T:强制校验，F：不强制
     */
    @ApiField("need_check_info")
    private String needCheckInfo;

    public String getCertNo() {
        return this.certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertType() {
        return this.certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getFixBuyer() {
        return this.fixBuyer;
    }

    public void setFixBuyer(String fixBuyer) {
        this.fixBuyer = fixBuyer;
    }

    public String getMinAge() {
        return this.minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeedCheckInfo() {
        return this.needCheckInfo;
    }

    public void setNeedCheckInfo(String needCheckInfo) {
        this.needCheckInfo = needCheckInfo;
    }

}
