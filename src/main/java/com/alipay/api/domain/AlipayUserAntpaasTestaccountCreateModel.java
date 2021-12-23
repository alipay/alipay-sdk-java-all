package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建测试支付宝账户
 *
 * @author auto create
 * @since 1.0, 2021-03-19 15:25:36
 */
public class AlipayUserAntpaasTestaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8193215573227563858L;

	/**
	 * 认证等级，L1，L2，L3，L3可以开店
	 */
	@ApiField("account_level")
	private String accountLevel;

	/**
	 * 证件中的姓名，必须为中文，尽量不要超过6个汉字
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，IDENTITY_CARD 身份证，PASSPORT 护照，HK_MC_CARD 港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 登录名，如邮箱的值
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 登录名类型，EMAIL
	 */
	@ApiField("logon_type")
	private String logonType;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作类型，CREATION 仅创建, CERTIFY 仅认证, CREATION_AND_CERTIFY 创建+认证
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作者工号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 调用方IP地址
	 */
	@ApiField("remote_ip")
	private String remoteIp;

	/**
	 * 支付宝账户id，accountNo
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 账户状态，T Q
	 */
	@ApiField("user_status")
	private String userStatus;

	/**
	 * 账户类型，PERSON 个人 ORG 企业
	 */
	@ApiField("user_type")
	private String userType;

	public String getAccountLevel() {
		return this.accountLevel;
	}
	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
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

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getLogonType() {
		return this.logonType;
	}
	public void setLogonType(String logonType) {
		this.logonType = logonType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}
	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserStatus() {
		return this.userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
