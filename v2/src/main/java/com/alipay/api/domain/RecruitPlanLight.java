package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案
 *
 * @author auto create
 * @since 1.0, 2022-09-10 17:16:59
 */
public class RecruitPlanLight extends AlipayObject {

	private static final long serialVersionUID = 3633576543559313645L;

	/**
	 * 招商方案描述：富文本内容，可能包含html标签
	 */
	@ApiField("description")
	private String description;

	/**
	 * 报名结束时间
	 */
	@ApiField("enroll_end_time")
	private Date enrollEndTime;

	/**
	 * 招商方案所属报名场景
枚举值：
VOUCHER：券报名场景；
MINI_APP：小程序报名场景；
	 */
	@ApiField("enroll_scene_type")
	private String enrollSceneType;

	/**
	 * 报名开始时间
	 */
	@ApiField("enroll_start_time")
	private Date enrollStartTime;

	/**
	 * 方案头图链接，150x150 以上尺寸的方形图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 招商方案ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 招商方案名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 招商方案状态
	 */
	@ApiField("status")
	private String status;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEnrollEndTime() {
		return this.enrollEndTime;
	}
	public void setEnrollEndTime(Date enrollEndTime) {
		this.enrollEndTime = enrollEndTime;
	}

	public String getEnrollSceneType() {
		return this.enrollSceneType;
	}
	public void setEnrollSceneType(String enrollSceneType) {
		this.enrollSceneType = enrollSceneType;
	}

	public Date getEnrollStartTime() {
		return this.enrollStartTime;
	}
	public void setEnrollStartTime(Date enrollStartTime) {
		this.enrollStartTime = enrollStartTime;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
