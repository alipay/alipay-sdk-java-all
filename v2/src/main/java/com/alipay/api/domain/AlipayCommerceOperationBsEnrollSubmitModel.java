package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联营-计划报名
 *
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:13
 */
public class AlipayCommerceOperationBsEnrollSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5544825477977584417L;

	/**
	 * 外部商户活动id，请确保在自己域内唯一。
plan_id为空时，该参数必传
	 */
	@ApiField("out_activity_id")
	private String outActivityId;

	/**
	 * 报名参与者，支持批量传参，最大10 当前字段已废弃(新接入场景请使用participants_new)
	 */
	@ApiListField("participants")
	@ApiField("bs_enroll_participant")
	@Deprecated
	private List<BsEnrollParticipant> participants;

	/**
	 * 报名对象，新接入场景都是用该属性
	 */
	@ApiListField("participants_new")
	@ApiField("bs_enroll_new_participant")
	private List<BsEnrollNewParticipant> participantsNew;

	/**
	 * 联营计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 没传plan_id的场景，需要传该参数
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getOutActivityId() {
		return this.outActivityId;
	}
	public void setOutActivityId(String outActivityId) {
		this.outActivityId = outActivityId;
	}

	public List<BsEnrollParticipant> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<BsEnrollParticipant> participants) {
		this.participants = participants;
	}

	public List<BsEnrollNewParticipant> getParticipantsNew() {
		return this.participantsNew;
	}
	public void setParticipantsNew(List<BsEnrollNewParticipant> participantsNew) {
		this.participantsNew = participantsNew;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
