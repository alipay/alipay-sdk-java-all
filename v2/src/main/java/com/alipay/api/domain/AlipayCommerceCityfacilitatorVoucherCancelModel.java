package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下渠道商凭核销码撤销该笔交易
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:54
 */
public class AlipayCommerceCityfacilitatorVoucherCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3163674486512779576L;

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
	 * 商户退款时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 核销号
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
