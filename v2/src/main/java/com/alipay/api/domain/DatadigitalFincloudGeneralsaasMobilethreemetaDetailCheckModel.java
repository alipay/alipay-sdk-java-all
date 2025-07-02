package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机号三要素核验详版
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:28:20
 */
public class DatadigitalFincloudGeneralsaasMobilethreemetaDetailCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8613898246357711665L;

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
