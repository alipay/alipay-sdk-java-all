package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程信息
 *
 * @author auto create
 * @since 1.0, 2020-05-27 18:20:10
 */
public class ContractManagerProcessSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 3565523962914726521L;

	/**
	 * 签署文档内容摘要
	 */
	@ApiField("abstract_content")
	private String abstractContent;

	/**
	 * 流程附件
	 */
	@ApiListField("attachments")
	@ApiField("contract_manager_attachments_syncrequest")
	private List<ContractManagerAttachmentsSyncrequest> attachments;

	/**
	 * 流程主题
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 合同截止时间（从签署文档中分析得到的数据）
	 */
	@ApiField("contract_deadline_time")
	private String contractDeadlineTime;

	/**
	 * 流程结束时间
	 */
	@ApiField("flow_end_time")
	private String flowEndTime;

	/**
	 * 流程Id
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 流程开始时间(时间戳)
	 */
	@ApiField("flow_start_time")
	private String flowStartTime;

	/**
	 * 签署状态 0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
	 */
	@ApiField("flow_status")
	private String flowStatus;

	/**
	 * 0-正式合同 1-活动文件(运营类活动文件 如情人节活动、防疫公约)
	 */
	@ApiField("flow_type")
	private String flowType;

	/**
	 * 商家Id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 参与人信息
	 */
	@ApiListField("participants")
	@ApiField("contract_manager_participants_sync_request")
	private List<ContractManagerParticipantsSyncRequest> participants;

	/**
	 * 签署合同的截止时间
	 */
	@ApiField("sign_deadline_time")
	private String signDeadlineTime;

	/**
	 * 签署文档
	 */
	@ApiListField("sign_docs")
	@ApiField("contract_manager_sign_docs_request")
	private List<ContractManagerSignDocsRequest> signDocs;

	/**
	 * 标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	public String getAbstractContent() {
		return this.abstractContent;
	}
	public void setAbstractContent(String abstractContent) {
		this.abstractContent = abstractContent;
	}

	public List<ContractManagerAttachmentsSyncrequest> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<ContractManagerAttachmentsSyncrequest> attachments) {
		this.attachments = attachments;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getContractDeadlineTime() {
		return this.contractDeadlineTime;
	}
	public void setContractDeadlineTime(String contractDeadlineTime) {
		this.contractDeadlineTime = contractDeadlineTime;
	}

	public String getFlowEndTime() {
		return this.flowEndTime;
	}
	public void setFlowEndTime(String flowEndTime) {
		this.flowEndTime = flowEndTime;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowStartTime() {
		return this.flowStartTime;
	}
	public void setFlowStartTime(String flowStartTime) {
		this.flowStartTime = flowStartTime;
	}

	public String getFlowStatus() {
		return this.flowStatus;
	}
	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	public String getFlowType() {
		return this.flowType;
	}
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<ContractManagerParticipantsSyncRequest> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<ContractManagerParticipantsSyncRequest> participants) {
		this.participants = participants;
	}

	public String getSignDeadlineTime() {
		return this.signDeadlineTime;
	}
	public void setSignDeadlineTime(String signDeadlineTime) {
		this.signDeadlineTime = signDeadlineTime;
	}

	public List<ContractManagerSignDocsRequest> getSignDocs() {
		return this.signDocs;
	}
	public void setSignDocs(List<ContractManagerSignDocsRequest> signDocs) {
		this.signDocs = signDocs;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
