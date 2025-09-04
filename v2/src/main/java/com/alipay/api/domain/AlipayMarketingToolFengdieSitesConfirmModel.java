package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶站点发布审批
 *
 * @author auto create
 * @since 1.0, 2021-06-25 21:53:13
 */
public class AlipayMarketingToolFengdieSitesConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4814722237269883849L;

	/**
	 * 欲审批发布的站点 Id
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 下线时间（注意：会覆盖创建站点接口设置的下线时间）
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参），应确保 operator 是参数 space_id 对应的空间成员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲审批的站点所归属的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	/**
	 * 是否允许发布该站点，值为 "AGREED" 表示允许，此时会将站点发布出去；值为 "REFUSED" 表示不允许，此时会将站点变为审批不通过状态
	 */
	@ApiField("status")
	private String status;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getOfflineTime() {
		return this.offlineTime;
	}
	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
