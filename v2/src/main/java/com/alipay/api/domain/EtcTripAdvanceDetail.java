package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * etc行程垫资详情
 *
 * @author auto create
 * @since 1.0, 2024-03-04 19:16:16
 */
public class EtcTripAdvanceDetail extends AlipayObject {

	private static final long serialVersionUID = 5547765675635499432L;

	/**
	 * 支付宝ETC平台设备协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 发行方扣款订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 支付成功时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 商户扣费的总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝etc平台行程id
	 */
	@ApiField("trip_id")
	private String tripId;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTripId() {
		return this.tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

}
