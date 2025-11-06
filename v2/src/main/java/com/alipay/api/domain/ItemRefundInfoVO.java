package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品退款信息
 *
 * @author auto create
 * @since 1.0, 2024-01-29 14:39:10
 */
public class ItemRefundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4129253981236547221L;

	/**
	 * 退款结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 退款开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 商品的退款状态
	 */
	@ApiField("status")
	private String status;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
