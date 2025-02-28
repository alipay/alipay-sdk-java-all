package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 棋盘人群池计算节点，节点类型有「标签」和「人群」两种
 *
 * @author auto create
 * @since 1.0, 2024-06-04 15:07:56
 */
public class OpenCrowdOperationNodeRequest extends AlipayObject {

	private static final long serialVersionUID = 5343661554268647449L;

	/**
	 * 如果计算节点类型是「tag 标签」，则传入「标签编码」，如果计算节点类型是「crowd 人群」，则传入「人群编码」
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 棋盘人群计算节点类型，支持「标签」和「人群」两种类型。
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 如果节点类型是「标签」，需要传入标签圈选值，如果节点类型是「人群」，不需要传入数据
	 */
	@ApiListField("operation_option_list")
	@ApiField("open_crowd_operation_option_request")
	private List<OpenCrowdOperationOptionRequest> operationOptionList;

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public List<OpenCrowdOperationOptionRequest> getOperationOptionList() {
		return this.operationOptionList;
	}
	public void setOperationOptionList(List<OpenCrowdOperationOptionRequest> operationOptionList) {
		this.operationOptionList = operationOptionList;
	}

}
