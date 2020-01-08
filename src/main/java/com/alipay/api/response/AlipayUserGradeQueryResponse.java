package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.grade.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-22 10:59:49
 */
public class AlipayUserGradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2572959157338196612L;

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
