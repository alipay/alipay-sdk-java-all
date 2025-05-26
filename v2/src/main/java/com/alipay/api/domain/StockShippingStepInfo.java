package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库单状态
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:28
 */
public class StockShippingStepInfo extends AlipayObject {

	private static final long serialVersionUID = 6624637214553598982L;

	/**
	 * 处理地点
	 */
	@ApiField("event_address")
	private String eventAddress;

	/**
	 * 处理时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 处理状态
	 */
	@ApiField("status")
	private String status;

	public String getEventAddress() {
		return this.eventAddress;
	}
	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
