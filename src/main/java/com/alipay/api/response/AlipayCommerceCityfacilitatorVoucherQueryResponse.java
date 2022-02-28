package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceCityfacilitatorVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5356729765973896492L;

	/** 
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 终点站
	 */
	@ApiField("end_station")
	private String endStation;

	/** 
	 * 终点站点名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/** 
	 * 订单中包含的票数
	 */
	@ApiField("quantity")
	private String quantity;

	/** 
	 * 起点站
	 */
	@ApiField("start_station")
	private String startStation;

	/** 
	 * 起始站点名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/** 
	 * 查询的该笔订单当前状态(SUCCESS、TRANSFER、FAIL等)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 票单价
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/** 
	 * 描述票种类
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	public String getEndStation( ) {
		return this.endStation;
	}

	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}
	public String getEndStationName( ) {
		return this.endStationName;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getQuantity( ) {
		return this.quantity;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getStartStation( ) {
		return this.startStation;
	}

	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}
	public String getStartStationName( ) {
		return this.startStationName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketPrice( ) {
		return this.ticketPrice;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getTicketType( ) {
		return this.ticketType;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
