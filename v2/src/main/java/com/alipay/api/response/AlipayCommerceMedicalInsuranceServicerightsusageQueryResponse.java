package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.servicerightsusage.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-26 10:32:58
 */
public class AlipayCommerceMedicalInsuranceServicerightsusageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6476771236745492637L;

	/** 
	 * 服务剩余次数，-1为无限次
	 */
	@ApiField("available_stock")
	private String availableStock;

	/** 
	 * 回传事件ID
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 服务首次使用时间
	 */
	@ApiField("first_use_time")
	private Date firstUseTime;

	/** 
	 * 履约数据集
	 */
	@ApiField("fulfillment_data")
	private String fulfillmentData;

	/** 
	 * 履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/** 
	 * 服务项名称
	 */
	@ApiField("fulfillment_name")
	private String fulfillmentName;

	/** 
	 * 履约状态
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/** 
	 * 履约类型
	 */
	@ApiField("fulfillment_type")
	private String fulfillmentType;

	/** 
	 * 事件发生时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/** 
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 权益流水号
	 */
	@ApiField("out_unique_biz_no")
	private String outUniqueBizNo;

	/** 
	 * 服务项ID
	 */
	@ApiField("service_item_id")
	private String serviceItemId;

	/** 
	 * 业务唯一单号
	 */
	@ApiField("unique_biz_no")
	private String uniqueBizNo;

	/** 
	 * 服务已使用次数
	 */
	@ApiField("used_times")
	private String usedTimes;

	/** 
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAvailableStock(String availableStock) {
		this.availableStock = availableStock;
	}
	public String getAvailableStock( ) {
		return this.availableStock;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

	public void setFirstUseTime(Date firstUseTime) {
		this.firstUseTime = firstUseTime;
	}
	public Date getFirstUseTime( ) {
		return this.firstUseTime;
	}

	public void setFulfillmentData(String fulfillmentData) {
		this.fulfillmentData = fulfillmentData;
	}
	public String getFulfillmentData( ) {
		return this.fulfillmentData;
	}

	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}
	public String getFulfillmentId( ) {
		return this.fulfillmentId;
	}

	public void setFulfillmentName(String fulfillmentName) {
		this.fulfillmentName = fulfillmentName;
	}
	public String getFulfillmentName( ) {
		return this.fulfillmentName;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}
	public String getFulfillmentStatus( ) {
		return this.fulfillmentStatus;
	}

	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}
	public String getFulfillmentType( ) {
		return this.fulfillmentType;
	}

	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}
	public Date getOccurTime( ) {
		return this.occurTime;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutUniqueBizNo(String outUniqueBizNo) {
		this.outUniqueBizNo = outUniqueBizNo;
	}
	public String getOutUniqueBizNo( ) {
		return this.outUniqueBizNo;
	}

	public void setServiceItemId(String serviceItemId) {
		this.serviceItemId = serviceItemId;
	}
	public String getServiceItemId( ) {
		return this.serviceItemId;
	}

	public void setUniqueBizNo(String uniqueBizNo) {
		this.uniqueBizNo = uniqueBizNo;
	}
	public String getUniqueBizNo( ) {
		return this.uniqueBizNo;
	}

	public void setUsedTimes(String usedTimes) {
		this.usedTimes = usedTimes;
	}
	public String getUsedTimes( ) {
		return this.usedTimes;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
