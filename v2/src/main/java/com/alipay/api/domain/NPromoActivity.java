package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N设备推广活动
 *
 * @author auto create
 * @since 1.0, 2024-11-29 15:43:51
 */
public class NPromoActivity extends AlipayObject {

	private static final long serialVersionUID = 3768981993781672499L;

	/**
	 * 活动描述
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	/**
	 * 活动设备sn
	 */
	@ApiField("activity_dvc_sn")
	private String activityDvcSn;

	/**
	 * 用户活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型（0元先享任务）
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 活动创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 活动生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 活动终止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 跳过日期
	 */
	@ApiListField("ignore_date")
	@ApiField("date")
	private List<Date> ignoreDate;

	/**
	 * 活动状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子活动列表
	 */
	@ApiListField("sub_activity_lists")
	@ApiField("n_promo_sub_activity")
	private List<NPromoSubActivity> subActivityLists;

	public String getActivityDesc() {
		return this.activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityDvcSn() {
		return this.activityDvcSn;
	}
	public void setActivityDvcSn(String activityDvcSn) {
		this.activityDvcSn = activityDvcSn;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<Date> getIgnoreDate() {
		return this.ignoreDate;
	}
	public void setIgnoreDate(List<Date> ignoreDate) {
		this.ignoreDate = ignoreDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<NPromoSubActivity> getSubActivityLists() {
		return this.subActivityLists;
	}
	public void setSubActivityLists(List<NPromoSubActivity> subActivityLists) {
		this.subActivityLists = subActivityLists;
	}

}
