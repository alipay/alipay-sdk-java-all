package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群操作池
 *
 * @author auto create
 * @since 1.0, 2023-11-08 15:26:20
 */
public class CrowdOperationPool extends AlipayObject {

	private static final long serialVersionUID = 6747759488624576465L;

	/**
	 * 人群池编码
	 */
	@ApiField("crowd_pool_code")
	private String crowdPoolCode;

	/**
	 * 人群池类型
	 */
	@ApiField("crowd_pool_type")
	private String crowdPoolType;

	/**
	 * 池内计算类型
	 */
	@ApiField("in_operation_type")
	private String inOperationType;

	/**
	 * 节点列表
	 */
	@ApiListField("node_list")
	@ApiField("crowd_operation_node")
	private List<CrowdOperationNode> nodeList;

	/**
	 * 池外计算类型
	 */
	@ApiField("out_operation_type")
	private String outOperationType;

	public String getCrowdPoolCode() {
		return this.crowdPoolCode;
	}
	public void setCrowdPoolCode(String crowdPoolCode) {
		this.crowdPoolCode = crowdPoolCode;
	}

	public String getCrowdPoolType() {
		return this.crowdPoolType;
	}
	public void setCrowdPoolType(String crowdPoolType) {
		this.crowdPoolType = crowdPoolType;
	}

	public String getInOperationType() {
		return this.inOperationType;
	}
	public void setInOperationType(String inOperationType) {
		this.inOperationType = inOperationType;
	}

	public List<CrowdOperationNode> getNodeList() {
		return this.nodeList;
	}
	public void setNodeList(List<CrowdOperationNode> nodeList) {
		this.nodeList = nodeList;
	}

	public String getOutOperationType() {
		return this.outOperationType;
	}
	public void setOutOperationType(String outOperationType) {
		this.outOperationType = outOperationType;
	}

}
