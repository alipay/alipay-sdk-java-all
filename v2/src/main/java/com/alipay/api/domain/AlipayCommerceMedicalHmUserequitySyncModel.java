package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户权益下发及查询
 *
 * @author auto create
 * @since 1.0, 2025-10-28 11:02:41
 */
public class AlipayCommerceMedicalHmUserequitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 5695558412226823688L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 支付宝给出固定枚举值，参考：证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 关联保司侧的登录账号
	 */
	@ApiField("company_account")
	private String companyAccount;

	/**
	 * 权益下发场景必填，支付宝后台生成后给出固定编码值
	 */
	@ApiField("equity_package_code")
	private String equityPackageCode;

	/**
	 * 标识唯一一次权益下发
	 */
	@ApiField("out_biz_serial_no")
	private String outBizSerialNo;

	/**
	 * 外部对接系统的用户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 约定合作项目标识，支付宝后台生成后给出固定编码值
	 */
	@ApiField("project_tag")
	private String projectTag;

	/**
	 * 用户手机号
	 */
	@ApiField("tel_no")
	private String telNo;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getCompanyAccount() {
		return this.companyAccount;
	}
	public void setCompanyAccount(String companyAccount) {
		this.companyAccount = companyAccount;
	}

	public String getEquityPackageCode() {
		return this.equityPackageCode;
	}
	public void setEquityPackageCode(String equityPackageCode) {
		this.equityPackageCode = equityPackageCode;
	}

	public String getOutBizSerialNo() {
		return this.outBizSerialNo;
	}
	public void setOutBizSerialNo(String outBizSerialNo) {
		this.outBizSerialNo = outBizSerialNo;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getProjectTag() {
		return this.projectTag;
	}
	public void setProjectTag(String projectTag) {
		this.projectTag = projectTag;
	}

	public String getTelNo() {
		return this.telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
