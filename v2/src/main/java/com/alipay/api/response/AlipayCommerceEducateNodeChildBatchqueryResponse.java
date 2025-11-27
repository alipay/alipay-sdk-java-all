package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduNodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.node.child.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:30
 */
public class AlipayCommerceEducateNodeChildBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7661631219888614999L;

	/** 
	 * 组织节点列表
	 */
	@ApiListField("node_list")
	@ApiField("edu_node_info")
	private List<EduNodeInfo> nodeList;

	public void setNodeList(List<EduNodeInfo> nodeList) {
		this.nodeList = nodeList;
	}
	public List<EduNodeInfo> getNodeList( ) {
		return this.nodeList;
	}

}
