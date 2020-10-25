package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 购票订单信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class TicketDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3824839479495597949L;

	/**
	 * 总金额，元为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 终点站编码
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 终点站中文名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 票数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 起点站编码
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 起点站中文名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 单价，元为单位
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/**
	 * 票类型
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEndStation() {
		return this.endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStartStation() {
		return this.startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTicketPrice() {
		return this.ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
