package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下地铁自助购票机上凭核销码取票,购票确认
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:55
 */
public class AlipayCommerceCityfacilitatorVoucherConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5573181432258466461L;

	/**
	 * 金额，元为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 渠道商提供的其它信息
	 */
	@ApiField("biz_info_ext")
	private String bizInfoExt;

	/**
	 * 该笔请求的唯一编号，有值请求强校验
	 */
	@ApiField("biz_request_id")
	private String bizRequestId;

	/**
	 * 城市标准码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 终点站编号
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 单张票编号列表，多个逗号分隔
	 */
	@ApiField("exchange_ids")
	private String exchangeIds;

	/**
	 * 商户核销时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 商户的交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 票数
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 请求方标识
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 起点站编号
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 核销号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 票单价，元为单位
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

	public String getBizInfoExt() {
		return this.bizInfoExt;
	}
	public void setBizInfoExt(String bizInfoExt) {
		this.bizInfoExt = bizInfoExt;
	}

	public String getBizRequestId() {
		return this.bizRequestId;
	}
	public void setBizRequestId(String bizRequestId) {
		this.bizRequestId = bizRequestId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEndStation() {
		return this.endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getExchangeIds() {
		return this.exchangeIds;
	}
	public void setExchangeIds(String exchangeIds) {
		this.exchangeIds = exchangeIds;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStartStation() {
		return this.startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
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
