package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群计算组合，支持组合内节点计算以及组合与组合间的计算。组合类型有「标签」和「人群」两种，同一人群池内节点类型必须完全一致。
 *
 * @author auto create
 * @since 1.0, 2024-06-04 15:07:56
 */
public class OpenCrowdOperationPoolRequest extends AlipayObject {

	private static final long serialVersionUID = 6327969913687849994L;

	/**
	 * 组合内节点类型必须一致，都是标签，或者都是人群
	 */
	@ApiField("crowd_pool_type")
	private String crowdPoolType;

	/**
	 * 组合节点的计算类型，组合内标签求交集、求并集，或者组合内人群求交集、求并集
	 */
	@ApiField("in_operation_type")
	private String inOperationType;

	/**
	 * 组合内的计算节点列表，如果是标签，则需要传入标签的标签信息、圈选项、圈选值，如果是人群，只需要传入人群编码
	 */
	@ApiListField("operation_node_list")
	@ApiField("open_crowd_operation_node_request")
	private List<OpenCrowdOperationNodeRequest> operationNodeList;

	/**
	 * 组合和其他组合的计算类型，支持交集、并集、差集三种方式。
	 */
	@ApiField("out_operation_type")
	private String outOperationType;

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

	public List<OpenCrowdOperationNodeRequest> getOperationNodeList() {
		return this.operationNodeList;
	}
	public void setOperationNodeList(List<OpenCrowdOperationNodeRequest> operationNodeList) {
		this.operationNodeList = operationNodeList;
	}

	public String getOutOperationType() {
		return this.outOperationType;
	}
	public void setOutOperationType(String outOperationType) {
		this.outOperationType = outOperationType;
	}

}
