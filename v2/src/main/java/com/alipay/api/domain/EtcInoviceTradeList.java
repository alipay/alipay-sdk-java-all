package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可开票行程下交易单列表
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:09
 */
public class EtcInoviceTradeList extends AlipayObject {

	private static final long serialVersionUID = 7464446426165134152L;

	/**
	 * 税额（可抵扣金额）单位：分
	 */
	@ApiField("allowance_amount")
	private Long allowanceAmount;

	/**
	 * 消费类型
	 */
	@ApiField("consumer_trans_type")
	private String consumerTransType;

	/**
	 * 出口收费站
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 出站时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开票状态
	 */
	@ApiField("invoice_progress_status")
	private String invoiceProgressStatus;

	/**
	 * 入口收费站
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 进站时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 交易金额单位,分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public Long getAllowanceAmount() {
		return this.allowanceAmount;
	}
	public void setAllowanceAmount(Long allowanceAmount) {
		this.allowanceAmount = allowanceAmount;
	}

	public String getConsumerTransType() {
		return this.consumerTransType;
	}
	public void setConsumerTransType(String consumerTransType) {
		this.consumerTransType = consumerTransType;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInvoiceProgressStatus() {
		return this.invoiceProgressStatus;
	}
	public void setInvoiceProgressStatus(String invoiceProgressStatus) {
		this.invoiceProgressStatus = invoiceProgressStatus;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
