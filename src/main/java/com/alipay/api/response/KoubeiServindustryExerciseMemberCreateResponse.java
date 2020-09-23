package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.exercise.member.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-01 10:37:15
 */
public class KoubeiServindustryExerciseMemberCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8384169181783584351L;

	/** 
	 * 口碑用户健身唯一ID，和支付宝userId一一对应
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/** 
	 * 口碑的会籍ID
	 */
	@ApiField("member_id")
	private String memberId;

	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}
	public String getFitnessId( ) {
		return this.fitnessId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId( ) {
		return this.memberId;
	}

}
