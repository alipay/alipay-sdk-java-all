package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-18 17:22:23
 */
public class AlipayEbppIndustryJobPayslipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4788137882181134258L;

	/** 
	 * 用户收款账户号码
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 支付宝登录账号: 手机号或者邮箱
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/** 
	 * 身份证号
	 */
	@ApiField("cert_num")
	private String certNum;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部业务id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}
	public String getAlipayLoginId( ) {
		return this.alipayLoginId;
	}

	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}
	public String getCertNum( ) {
		return this.certNum;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
