package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署流程撤销（E签宝）
 *
 * @author auto create
 * @since 1.0, 2019-12-26 21:36:12
 */
public class AlipayEcoSignFlowCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4421433368156313394L;

	/**
	 * 流程id，通过 <a href ="https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create">创建电子合同签署流程</a>(alipay.eco.contract.signflows.create)接口获取。
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 撤销原因，默认为"撤销"。商家可自定义。
	 */
	@ApiField("revoke_reason")
	private String revokeReason;

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getRevokeReason() {
		return this.revokeReason;
	}
	public void setRevokeReason(String revokeReason) {
		this.revokeReason = revokeReason;
	}

}
