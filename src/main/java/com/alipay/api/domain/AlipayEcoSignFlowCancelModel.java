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

	private static final long serialVersionUID = 2897227544162337736L;

	/**
	 * 流程id
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 撤销原因,默认"撤销"
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
