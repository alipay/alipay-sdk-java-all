package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机号三要素核验简版
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:28:20
 */
public class DatadigitalFincloudGeneralsaasMobilethreemetaSimpleCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7652524492298743538L;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用户姓名，与身份证上的姓名相匹配
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 大陆身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 客户业务单据号
	 */
	@ApiField("outer_biz_no")
	private String outerBizNo;

	/**
	 * 需核验的手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	public String getOuterBizNo() {
		return this.outerBizNo;
	}
	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
