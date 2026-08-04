package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商户开通结果
 *
 * @author auto create
 * @since 1.0, 2026-08-03 10:57:48
 */
public class AlipayCommerceEcChannelinvoiceMerchantopenGetModel extends AlipayObject {

	private static final long serialVersionUID = 6145352138114755471L;

	/**
	 * 乐企开通流水 ID
	 */
	@ApiField("flow_id")
	private String flowId;

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

}
