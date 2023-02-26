package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取签署流程合同与附件的下载地址（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-02-04 14:12:43
 */
public class AlipayEcoSignflowsDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2784923822511454976L;

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
