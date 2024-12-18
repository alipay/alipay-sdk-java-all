package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-16 18:13:37
 */
public class AlipayEbppIndustryJobPayslipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3572637875199719227L;

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
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
