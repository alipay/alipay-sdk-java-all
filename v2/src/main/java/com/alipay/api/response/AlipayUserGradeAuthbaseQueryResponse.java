package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.grade.authbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:56:57
 */
public class AlipayUserGradeAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5594793573139383995L;

	/** 
	 * 用户的蚂蚁会员积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/** 
	 * 用户的蚂蚁会员等级
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
