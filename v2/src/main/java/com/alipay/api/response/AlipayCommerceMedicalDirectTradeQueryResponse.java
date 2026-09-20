package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.direct.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:13
 */
public class AlipayCommerceMedicalDirectTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2213421745766276942L;

	/** 
	 * 支付宝交易单号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 渠道业务场景
	 */
	@ApiField("ch_info")
	private String chInfo;

	/** 
	 * 创单时传入的创建时间
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/** 
	 * 有自费时且自费支付成功时该字段有值
	 */
	@ApiField("gmt_own_paid")
	private Date gmtOwnPaid;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付失败时该字段有值
	 */
	@ApiField("own_error_reason")
	private String ownErrorReason;

	/** 
	 * 自费支付状态（有自费部分时有值）
	 */
	@ApiField("own_pay_status")
	private String ownPayStatus;

	/** 
	 * 自费支付金额，单位是元
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 订单总金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 逸康交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 订单状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}
	public String getChInfo( ) {
		return this.chInfo;
	}

	public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}
	public Date getGmtOutCreate( ) {
		return this.gmtOutCreate;
	}

	public void setGmtOwnPaid(Date gmtOwnPaid) {
		this.gmtOwnPaid = gmtOwnPaid;
	}
	public Date getGmtOwnPaid( ) {
		return this.gmtOwnPaid;
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

	public void setOwnErrorReason(String ownErrorReason) {
		this.ownErrorReason = ownErrorReason;
	}
	public String getOwnErrorReason( ) {
		return this.ownErrorReason;
	}

	public void setOwnPayStatus(String ownPayStatus) {
		this.ownPayStatus = ownPayStatus;
	}
	public String getOwnPayStatus( ) {
		return this.ownPayStatus;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
