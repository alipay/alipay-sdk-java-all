package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货人及地址信息
 *
 * @author auto create
 * @since 1.0, 2019-04-02 16:24:40
 */
public class ReceiverAddressInfo extends AlipayObject {

    private static final long serialVersionUID = 6132343741286743654L;

    /**
     * 收货地址
     */
    @ApiField("address")
    private String address;

    /**
     * 中国标准城市区域码
     */
    @ApiField("division_code")
    private String divisionCode;

    /**
     * 收货人手机号
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 收货人的姓名
     */
    @ApiField("name")
    private String name;

    /**
     * 收货地址邮编
     */
    @ApiField("zip")
    private String zip;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
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

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
