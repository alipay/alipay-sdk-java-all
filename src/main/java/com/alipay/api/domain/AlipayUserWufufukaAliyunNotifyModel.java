package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝虎年福气商店库存清零通知接口
 *
 * @author auto create
 * @since 1.0, 2021-12-10 15:55:08
 */
public class AlipayUserWufufukaAliyunNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4456647784644596989L;

	/**
	 * 阿里云配置的活动id,支付宝基于此id进行库存修改
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 阿里云业务id，阿里云分配并传递，支付宝进行校验
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 阿里云商品id，支付宝理解并基于此修改库存
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 请求时间，请求中默认携带
	 */
	@ApiField("notice_time")
	private Date noticeTime;

	/**
	 * 通知类型，此接口中，支付宝侧仅感知SESSSION_INVENTORY_TO_ZERO单个值
	 */
	@ApiField("notice_type")
	private String noticeType;

	/**
	 * 请求id，阿里云唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 阿里云场次id，支付宝理解并修改库存
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 阿里云子业务id
	 */
	@ApiField("sub_biz_id")
	private String subBizId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Date getNoticeTime() {
		return this.noticeTime;
	}
	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}

	public String getNoticeType() {
		return this.noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSubBizId() {
		return this.subBizId;
	}
	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
	}

}
