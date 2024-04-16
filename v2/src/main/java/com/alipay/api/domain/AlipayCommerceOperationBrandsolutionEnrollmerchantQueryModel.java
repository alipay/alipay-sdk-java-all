package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消百万小店活动报名商家查询
 *
 * @author auto create
 * @since 1.0, 2023-06-09 19:10:53
 */
public class AlipayCommerceOperationBrandsolutionEnrollmerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2528649318299911163L;

	/**
	 * 活动唯一标识
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * pid的列表，只查询需要的pid的报名列表
	 */
	@ApiListField("pids")
	@ApiField("string")
	private List<String> pids;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<String> getPids() {
		return this.pids;
	}
	public void setPids(List<String> pids) {
		this.pids = pids;
	}

}
