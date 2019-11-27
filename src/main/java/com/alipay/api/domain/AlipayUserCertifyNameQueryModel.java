package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝认证信息用户名称查询
 *
 * @author auto create
 * @since 1.0, 2019-10-24 11:05:21
 */
public class AlipayUserCertifyNameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5793431893419643947L;

	/**
	 * 业务来源，用于识别业务方
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型,常用的类型：IDENTITY_CARD为身份证，
BUSINESS_LICENSE为营业执照
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户类型，个人类型填 2, 企业类型填 1
	 */
	@ApiField("user_type")
	private String userType;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
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

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
