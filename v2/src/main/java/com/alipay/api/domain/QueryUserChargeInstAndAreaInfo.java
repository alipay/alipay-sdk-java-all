package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出账机构与城市信息对象信息
 *
 * @author auto create
 * @since 1.0, 2022-11-07 19:31:00
 */
public class QueryUserChargeInstAndAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 3764171998737646759L;

	/**
	 * 出账机构简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 缴费次数
	 */
	@ApiField("pay_count")
	private String payCount;

	/**
	 * 最近一次缴费日期
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 子业务类型：
 电费:ELECTRIC,水费:WATER,GAS:燃气费
  暖气费：HEATING, 有线电视费:CATV
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeInstName() {
		return this.chargeInstName;
	}
	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getPayCount() {
		return this.payCount;
	}
	public void setPayCount(String payCount) {
		this.payCount = payCount;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
