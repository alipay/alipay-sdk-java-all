package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付后推荐方案模型信息
 *
 * @author auto create
 * @since 1.0, 2019-09-27 16:54:39
 */
public class PaymentSuccessPagePlanInfo extends AlipayObject {

	private static final long serialVersionUID = 3519614221283256441L;

	/**
	 * 创建支付后推荐方案时填写的收藏有礼活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 有礼活动状态，目前返回的状态枚举值包括：NOT_WORKING(非进行中)，WORKING(进行中)，NO_COUPON_LIFT(券剩余量为0)
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 支付后推荐开始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 支付后推荐方案结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 支付后推荐应用id，当type=TINYAPP，则为小程序应用id；当type=PUBLICAPP,则为生活号应用id
	 */
	@ApiField("oper_app_id")
	private String operAppId;

	/**
	 * 支付后推荐方案ID，用以唯一标识方案
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 支付后推荐方案名称，用以描述方案的名字
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 支付后推荐方案优先级，目前仅支持0和1两个枚举值，其中数值越大优先级越高
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 用户提交创建支付后推荐方案后，被蚂蚁小二审核拒绝的原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 创建支付后推荐方案时填写的可用的服务能力标签数组
	 */
	@ApiListField("service_list")
	@ApiField("string")
	private List<String> serviceList;

	/**
	 * 支付后推荐方案状态，目前支持的枚举值如下：审核中--AUDITING;进行中--WORKING;被驳回--REJECTED;已结束--FINISHED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付后推荐类型，目前只支持小程序和生活号的推荐
	 */
	@ApiField("type")
	private String type;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOperAppId() {
		return this.operAppId;
	}
	public void setOperAppId(String operAppId) {
		this.operAppId = operAppId;
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

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public List<String> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<String> serviceList) {
		this.serviceList = serviceList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
