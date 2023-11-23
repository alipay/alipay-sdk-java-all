package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序收藏引导活动批量
 *
 * @author auto create
 * @since 1.0, 2023-06-28 10:17:53
 */
public class TipsDelivery extends AlipayObject {

	private static final long serialVersionUID = 4178275938274144777L;

	/**
	 * 收藏引导文案内容，不得超过14个字
	 */
	@ApiField("delivery_content")
	private String deliveryContent;

	/**
	 * 收藏引导投放活动ID
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 收藏引导活动名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 文案审核驳回理由，仅状态为AUDIT_REJECTED时有效
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 匹配类型
	 */
	@ApiField("match_type")
	private String matchType;

	/**
	 * 目标页面地址，当匹配类型为TARGETURL时，投放文案仅在当前页面生效
	 */
	@ApiField("match_url")
	private String matchUrl;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态
	 */
	@ApiField("status")
	private String status;

	public String getDeliveryContent() {
		return this.deliveryContent;
	}
	public void setDeliveryContent(String deliveryContent) {
		this.deliveryContent = deliveryContent;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getMatchType() {
		return this.matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getMatchUrl() {
		return this.matchUrl;
	}
	public void setMatchUrl(String matchUrl) {
		this.matchUrl = matchUrl;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
