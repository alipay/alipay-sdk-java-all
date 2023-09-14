package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tips.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:26:45
 */
public class AlipayOpenMiniTipsDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5361936321528467343L;

	/** 
	 * 收藏引导文案内容
	 */
	@ApiField("delivery_content")
	private String deliveryContent;

	/** 
	 * 收藏引导投放活动ID
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/** 
	 * 收藏引导配置投放活动的名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 文案审核驳回理由，仅AUDIT_REJECTED生效
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 匹配类型
	 */
	@ApiField("match_type")
	private String matchType;

	/** 
	 * 目标页面地址
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

	public void setDeliveryContent(String deliveryContent) {
		this.deliveryContent = deliveryContent;
	}
	public String getDeliveryContent( ) {
		return this.deliveryContent;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryName( ) {
		return this.deliveryName;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getMatchType( ) {
		return this.matchType;
	}

	public void setMatchUrl(String matchUrl) {
		this.matchUrl = matchUrl;
	}
	public String getMatchUrl( ) {
		return this.matchUrl;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
