package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.mpoint.authbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-12 17:59:34
 */
public class AlipayUserMpointAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3336483661934463547L;

	/** 
	 * 支付宝用户的蚂蚁会员积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/** 
	 * 支付宝用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Long getBalance( ) {
		return this.balance;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade( ) {
		return this.grade;
	}

}
