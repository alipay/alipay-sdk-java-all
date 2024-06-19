package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步外部证书到蚂蚁森林
 *
 * @author auto create
 * @since 1.0, 2024-03-14 19:28:39
 */
public class AlipaySocialAntforestTreeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7623453995847966576L;

	/**
	 * 待同步的证书的来源账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 待同步时的证书id，有之前调用申请兑换树种成功时返回的证书id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * JSON字符串，历史数据同步时accountName、type、participant必填，其他字段选填。其中accountName为账号名称，例如钉钉固定传“钉钉”，type为合种类型：班级或公司公益林（class/corp），cooperation为合种名称或班级名称，participant为兑换证书时合种的人数，非合种实时人数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 待同步证书的所属用户，蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 待同步证书的所属用户，蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
