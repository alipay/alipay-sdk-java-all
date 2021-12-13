package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下地铁自助购票机上凭核销码取票，渠道商凭用户输入的核销码调接口查询核销码的有效性。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6611532648794865189L;

	/**
	 * 城市标准码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 8位核销码
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
