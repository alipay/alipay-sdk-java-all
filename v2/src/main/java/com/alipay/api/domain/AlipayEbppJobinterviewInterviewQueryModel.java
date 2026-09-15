package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查面试状态与结果
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class AlipayEbppJobinterviewInterviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1696515715699235528L;

	/**
	 * 候选人唯一ID（三个ID必填一个：外部候选人ID / 身份证ID / 候选人唯一ID）
	 */
	@ApiField("candidate_id")
	private String candidateId;

	/**
	 * 外部候选人ID（三个ID必填一个：外部候选人ID / 身份证ID / 候选人唯一ID）
	 */
	@ApiField("external_candidate_id")
	private String externalCandidateId;

	/**
	 * 身份证ID（三个ID必填一个：外部候选人ID / 身份证ID / 候选人唯一ID）
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 面试间ID
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 租户ID，接入方统一租户标识，空则报"租户ID不能为空"
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getCandidateId() {
		return this.candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getExternalCandidateId() {
		return this.externalCandidateId;
	}
	public void setExternalCandidateId(String externalCandidateId) {
		this.externalCandidateId = externalCandidateId;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
