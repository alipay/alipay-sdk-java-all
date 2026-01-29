package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BsEnrollParticipant;
import com.alipay.api.domain.BsEnrollParticipantResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.enroll.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:42
 */
public class AlipayCommerceOperationBsEnrollSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5473749184628655899L;

	/** 
	 * 处理失败的参与者列表
	 */
	@ApiListField("failed_participants")
	@ApiField("bs_enroll_participant")
	private List<BsEnrollParticipant> failedParticipants;

	/** 
	 * 报名结果，包括报名成功和报名失败。
入参使用participants_new时，返回该字段
	 */
	@ApiListField("participants_result")
	@ApiField("bs_enroll_participant_result")
	private List<BsEnrollParticipantResult> participantsResult;

	public void setFailedParticipants(List<BsEnrollParticipant> failedParticipants) {
		this.failedParticipants = failedParticipants;
	}
	public List<BsEnrollParticipant> getFailedParticipants( ) {
		return this.failedParticipants;
	}

	public void setParticipantsResult(List<BsEnrollParticipantResult> participantsResult) {
		this.participantsResult = participantsResult;
	}
	public List<BsEnrollParticipantResult> getParticipantsResult( ) {
		return this.participantsResult;
	}

}
