package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收单品列表查询(废弃)
 *
 * @author auto create
 * @since 1.0, 2022-12-07 11:01:44
 */
public class KoubeiQualityTestCloudacptItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7689946528912467888L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * partener id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * user id
	 */
	@ApiField("uid")
	private String uid;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
