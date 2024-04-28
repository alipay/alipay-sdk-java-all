package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.customs.payorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:29
 */
public class AlipayFincoreComplianceCustomsPayorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8896623634713852468L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * email+不唯一+海关推支付单+无+cif查询+内部菜鸟使用
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 清算交易号，如果没有被动清算时，返回空字符串
	 */
	@ApiField("pay_transaction_id")
	private String payTransactionId;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	/** 
	 * 清算机构号，YL、WL，没有时返回空字段串
	 */
	@ApiField("ver_dept")
	private String verDept;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setPayTransactionId(String payTransactionId) {
		this.payTransactionId = payTransactionId;
	}
	public String getPayTransactionId( ) {
		return this.payTransactionId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

	public void setVerDept(String verDept) {
		this.verDept = verDept;
	}
	public String getVerDept( ) {
		return this.verDept;
	}

}
