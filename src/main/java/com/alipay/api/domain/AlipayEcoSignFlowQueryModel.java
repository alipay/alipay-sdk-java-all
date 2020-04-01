package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署流程查询（E签宝）
 *
 * @author auto create
 * @since 1.0, 2019-12-26 21:37:50
 */
public class AlipayEcoSignFlowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4588763918162816456L;

	/**
	 * 流程id
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
