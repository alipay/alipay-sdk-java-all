package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 图灵标签圈选预估人群数量
 *
 * @author auto create
 * @since 1.0, 2023-12-04 15:23:57
 */
public class AlipayMerchantQipanCrowdwithturingtagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7866897269848881727L;

	/**
	 * 人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 人群标签池
	 */
	@ApiListField("crowd_pool_list")
	@ApiField("crowd_operation_pool")
	private List<CrowdOperationPool> crowdPoolList;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public List<CrowdOperationPool> getCrowdPoolList() {
		return this.crowdPoolList;
	}
	public void setCrowdPoolList(List<CrowdOperationPool> crowdPoolList) {
		this.crowdPoolList = crowdPoolList;
	}

}
