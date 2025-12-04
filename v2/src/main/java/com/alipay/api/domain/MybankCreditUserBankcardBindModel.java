package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改绑定的银行卡
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:17:14
 */
public class MybankCreditUserBankcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 5325836977371416694L;

	/**
	 * 银行卡持有人的姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 综管类型。目前只支持ALIPAY，业务方不需要理解该字段内容，按要求传值即可。
	 */
	@ApiField("admin_type")
	private String adminType;

	/**
	 * 综管账号ID。目前综管只支持ALIPAY，所以接入方理解成就传支付宝ID就可以
	 */
	@ApiField("admin_user_id")
	private String adminUserId;

	/**
	 * 需要绑定的银行卡的号码
	 */
	@ApiField("bankcard_no")
	private String bankcardNo;

	/**
	 * 持卡人证件号码，证件类型为IDENTITY_CARD的时候，该值为身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。持卡人的证件的类型，身份证传"IDENTITY_CARD"，目前只支持身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 金融交换码
工商银行 ICBCC1CN
农业银行 AOBCC1CN
中国银行 BKCHC1CN
建设银行 PCBCC1CN
交通银行 BOCMC1CN
中信银行 ECITC1CN
广发银行 CGBCC1CN
民生银行 CMBCC1CN
光大银行 CEBBC1CN
平安银行 PINGC1CN
招商银行 CMBKC1CN
兴业银行 CIBKC1CN
浦发银行 SPDBC1CN
上海银行 SHHBC1CN
宁波银行 NBCBC1CN
	 */
	@ApiField("fip_code")
	private String fipCode;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 该银行卡的用途。
还款账户：REPAYACCOUNT
放款账户：GRANTACCOUNT
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * 外部流水号,唯一标识客户的一笔申请，做幂等性控制。格式：日期(8位)+序列号(8位）,序列号是数字，如00000001
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAdminType() {
		return this.adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}

	public String getAdminUserId() {
		return this.adminUserId;
	}
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getBankcardNo() {
		return this.bankcardNo;
	}
	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
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

	public String getFipCode() {
		return this.fipCode;
	}
	public void setFipCode(String fipCode) {
		this.fipCode = fipCode;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
