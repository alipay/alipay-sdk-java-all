package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机号信息
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:24:45
 */
public class MobilePhoneInfo extends AlipayObject {

	private static final long serialVersionUID = 7681418336961263761L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 运营商缩写
	 */
	@ApiField("operator_abbr")
	private String operatorAbbr;

	/**
	 * 运营商名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 号段
	 */
	@ApiField("segment_number")
	private String segmentNumber;

	/**
	 * 子运营商
	 */
	@ApiField("sub_operator")
	private String subOperator;

	/**
	 * 区号
	 */
	@ApiField("tel_code")
	private String telCode;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOperatorAbbr() {
		return this.operatorAbbr;
	}
	public void setOperatorAbbr(String operatorAbbr) {
		this.operatorAbbr = operatorAbbr;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSegmentNumber() {
		return this.segmentNumber;
	}
	public void setSegmentNumber(String segmentNumber) {
		this.segmentNumber = segmentNumber;
	}

	public String getSubOperator() {
		return this.subOperator;
	}
	public void setSubOperator(String subOperator) {
		this.subOperator = subOperator;
	}

	public String getTelCode() {
		return this.telCode;
	}
	public void setTelCode(String telCode) {
		this.telCode = telCode;
	}

}
