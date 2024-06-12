package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 棋盘人群创建
 *
 * @author auto create
 * @since 1.0, 2024-06-06 14:37:16
 */
public class AlipayMarketingQipanCrowdoperationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4416355255934989689L;

	/**
	 * 人群名称不可重复
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 根据传入的计算组合生产人群，支持两种模式：标签圈选（计算组合节点都为标签）、组合人群（计算组合组合都为人群）
	 */
	@ApiListField("operation_pool_list")
	@ApiField("open_crowd_operation_pool_request")
	private List<OpenCrowdOperationPoolRequest> operationPoolList;

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public List<OpenCrowdOperationPoolRequest> getOperationPoolList() {
		return this.operationPoolList;
	}
	public void setOperationPoolList(List<OpenCrowdOperationPoolRequest> operationPoolList) {
		this.operationPoolList = operationPoolList;
	}

}
