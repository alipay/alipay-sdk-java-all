package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群推送场景下淘宝ab实验信息
 *
 * @author auto create
 * @since 1.0, 2026-10-10 21:41:08
 */
public class ExperimentObject extends AlipayObject {

	private static final long serialVersionUID = 8631228955229253562L;

	/**
	 * 实验活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 实验的分组id
	 */
	@ApiField("experiment_group_id")
	private String experimentGroupId;

	/**
	 * 实验id
	 */
	@ApiField("experiment_id")
	private String experimentId;

	/**
	 * 是否命中实验组
	 */
	@ApiField("expose")
	private Boolean expose;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getExperimentGroupId() {
		return this.experimentGroupId;
	}
	public void setExperimentGroupId(String experimentGroupId) {
		this.experimentGroupId = experimentGroupId;
	}

	public String getExperimentId() {
		return this.experimentId;
	}
	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
	}

	public Boolean getExpose() {
		return this.expose;
	}
	public void setExpose(Boolean expose) {
		this.expose = expose;
	}

}
