package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑健身会籍删除
 *
 * @author auto create
 * @since 1.0, 2019-08-01 10:37:42
 */
public class KoubeiServindustryExerciseMemberDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5244233579243233143L;

	/**
	 * 外部会籍id
	 */
	@ApiField("external_member_id")
	private String externalMemberId;

	/**
	 * 健身用户id
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 口碑的会籍ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 外部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getExternalMemberId() {
		return this.externalMemberId;
	}
	public void setExternalMemberId(String externalMemberId) {
		this.externalMemberId = externalMemberId;
	}

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
