package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行行业CN站与国际站信息同步接口
 *
 * @author auto create
 * @since 1.0, 2022-01-21 16:05:54
 */
public class AlipayCommerceTransportWorldDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1588945585577613428L;

	/**
	 * 业务数据，外部商户不消费，如：支付宝主站卡类型
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务请求标识，用来标识一次请求，同一 应用id同一场景值唯一
	 */
	@ApiField("event_no")
	private String eventNo;

	/**
	 * 描述当前同步请求的事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 请求来源，由支付宝主站分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 需要同步的数据
	 */
	@ApiField("sync_data")
	private String syncData;

	/**
	 * 支付宝主站用户ID。涉及用户的请求时必填，用于LDC路由；其他请求可为空，路由至最近的RZONE
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getEventNo() {
		return this.eventNo;
	}
	public void setEventNo(String eventNo) {
		this.eventNo = eventNo;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSyncData() {
		return this.syncData;
	}
	public void setSyncData(String syncData) {
		this.syncData = syncData;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
