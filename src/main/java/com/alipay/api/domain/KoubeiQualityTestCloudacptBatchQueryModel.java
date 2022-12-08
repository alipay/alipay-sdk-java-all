package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收单品列表查询
 *
 * @author auto create
 * @since 1.0, 2022-12-07 11:02:05
 */
public class KoubeiQualityTestCloudacptBatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2264425981965576711L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

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
