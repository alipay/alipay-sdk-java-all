package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待查账的户号
 *
 * @author auto create
 * @since 1.0, 2022-06-17 17:00:12
 */
public class BillKeyInfo extends AlipayObject {

	private static final long serialVersionUID = 1722531449941812867L;

	/**
	 * 户号
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 一级业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 城市（6位code）
举例：杭州市：330100
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区县（6位code）
举例： 西湖区 330106
	 */
	@ApiField("country")
	private String country;

	/**
	 * 省份（6位code）
举例：浙江省：330000
	 */
	@ApiField("province")
	private String province;

	/**
	 * 水费：WATER
电费：ELECTRIC
燃气费：GAS
暖气费：HEATING
有限电视：CATV
固话和宽带都是：COMMUN
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
