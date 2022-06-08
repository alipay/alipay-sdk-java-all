package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署流程查询（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:22:13
 */
public class AlipayEcoSignFlowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1198642725893258836L;

	/**
	 * 流程id，通过 <a href ="https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create">创建电子合同签署流程</a>(alipay.eco.contract.signflows.create)接口获取。
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
