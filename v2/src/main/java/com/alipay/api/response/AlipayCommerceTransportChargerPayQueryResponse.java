package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChargerOrderInfo;
import com.alipay.api.domain.ChargerTradeSettleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pay.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:07:27
 */
public class AlipayCommerceTransportChargerPayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7685361972423653473L;

	/** 
	 * 业务订单详情信息
	 */
	@ApiField("charger_order_info")
	private ChargerOrderInfo chargerOrderInfo;

	/** 
	 * 商户同步优惠金额。单位为元，精确到小数点后两位
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

	/** 
	 * 商户同步支付金额。单位为元，精确到小数点后两位
	 */
	@ApiField("merchant_pay_amount")
	private String merchantPayAmount;

	/** 
	 * 商户同步订单总金额。单位为元，精确到小数点后两位
	 */
	@ApiField("merchant_total_amount")
	private String merchantTotalAmount;

	/** 
	 * 行业支付订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单创建时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/** 
	 * 订单类型。PNC（即插即充）、NORMAL（普通订单）
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付宝侧交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 实际交易信息
	 */
	@ApiField("trade_settle_info")
	private ChargerTradeSettleInfo tradeSettleInfo;

	/** 
	 * 订单交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setChargerOrderInfo(ChargerOrderInfo chargerOrderInfo) {
		this.chargerOrderInfo = chargerOrderInfo;
	}
	public ChargerOrderInfo getChargerOrderInfo( ) {
		return this.chargerOrderInfo;
	}

	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}
	public String getMerchantDiscountAmount( ) {
		return this.merchantDiscountAmount;
	}

	public void setMerchantPayAmount(String merchantPayAmount) {
		this.merchantPayAmount = merchantPayAmount;
	}
	public String getMerchantPayAmount( ) {
		return this.merchantPayAmount;
	}

	public void setMerchantTotalAmount(String merchantTotalAmount) {
		this.merchantTotalAmount = merchantTotalAmount;
	}
	public String getMerchantTotalAmount( ) {
		return this.merchantTotalAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getOrderTime( ) {
		return this.orderTime;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeSettleInfo(ChargerTradeSettleInfo tradeSettleInfo) {
		this.tradeSettleInfo = tradeSettleInfo;
	}
	public ChargerTradeSettleInfo getTradeSettleInfo( ) {
		return this.tradeSettleInfo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
