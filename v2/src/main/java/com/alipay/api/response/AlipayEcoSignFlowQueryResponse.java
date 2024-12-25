package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FlowSigner;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.sign.flow.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayEcoSignFlowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1136642953188531154L;

	/** 
	 * 文件主题
	 */
	@ApiField("business_scene")
	private String businessScene;

	/** 
	 * 文件有效截止日期
	 */
	@ApiField("contract_validity")
	private Long contractValidity;

	/** 
	 * 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
	 */
	@ApiField("flow_desc")
	private String flowDesc;

	/** 
	 * 流程结束时间
	 */
	@ApiField("flow_end_time")
	private Long flowEndTime;

	/** 
	 * 流程Id
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 流程开始时间
	 */
	@ApiField("flow_start_time")
	private Long flowStartTime;

	/** 
	 * 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
	 */
	@ApiField("flow_status")
	private Long flowStatus;

	/** 
	 * 通知开发者地址
	 */
	@ApiField("notice_developer_url")
	private String noticeDeveloperUrl;

	/** 
	 * 签署有效截止日期
	 */
	@ApiField("sign_validity")
	private Long signValidity;

	/** 
	 * 签署人列表及签署状态
	 */
	@ApiListField("signers")
	@ApiField("flow_signer")
	private List<FlowSigner> signers;

	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}
	public String getBusinessScene( ) {
		return this.businessScene;
	}

	public void setContractValidity(Long contractValidity) {
		this.contractValidity = contractValidity;
	}
	public Long getContractValidity( ) {
		return this.contractValidity;
	}

	public void setFlowDesc(String flowDesc) {
		this.flowDesc = flowDesc;
	}
	public String getFlowDesc( ) {
		return this.flowDesc;
	}

	public void setFlowEndTime(Long flowEndTime) {
		this.flowEndTime = flowEndTime;
	}
	public Long getFlowEndTime( ) {
		return this.flowEndTime;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

	public void setFlowStartTime(Long flowStartTime) {
		this.flowStartTime = flowStartTime;
	}
	public Long getFlowStartTime( ) {
		return this.flowStartTime;
	}

	public void setFlowStatus(Long flowStatus) {
		this.flowStatus = flowStatus;
	}
	public Long getFlowStatus( ) {
		return this.flowStatus;
	}

	public void setNoticeDeveloperUrl(String noticeDeveloperUrl) {
		this.noticeDeveloperUrl = noticeDeveloperUrl;
	}
	public String getNoticeDeveloperUrl( ) {
		return this.noticeDeveloperUrl;
	}

	public void setSignValidity(Long signValidity) {
		this.signValidity = signValidity;
	}
	public Long getSignValidity( ) {
		return this.signValidity;
	}

	public void setSigners(List<FlowSigner> signers) {
		this.signers = signers;
	}
	public List<FlowSigner> getSigners( ) {
		return this.signers;
	}

}
