package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下地铁自助购票机上凭核销码取票，票号上传接口
 *
 * @author auto create
 * @since 1.0, 2024-12-09 16:03:57
 */
public class AlipayCommerceCityfacilitatorVoucherUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8692275996328192416L;

	/**
	 * 渠道商提供的其它信息
	 */
	@ApiField("biz_info_ext")
	private String bizInfoExt;

	/**
	 * 城市标准码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * JSON字符串，包含出票的序列号，票号，出票时间，出票流水号
	 */
	@ApiField("exchange_ids")
	private String exchangeIds;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 核销码
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizInfoExt() {
		return this.bizInfoExt;
	}
	public void setBizInfoExt(String bizInfoExt) {
		this.bizInfoExt = bizInfoExt;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
