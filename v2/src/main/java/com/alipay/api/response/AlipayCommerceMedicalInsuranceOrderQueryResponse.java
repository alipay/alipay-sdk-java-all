package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 17:47:27
 */
public class AlipayCommerceMedicalInsuranceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7337169376573859964L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 订单状态：
WAIT_PAY：待支付
PAY_COMPLETED：已支付
TRADE_CLOSED：交易关闭
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部医院ID
	 */
	@ApiField("out_hospital_id")
	private String outHospitalId;

	/** 
	 * 外部医院名称
	 */
	@ApiField("out_hospital_name")
	private String outHospitalName;

	/** 
	 * 订单支付时传入的商户订单号。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 因公付金额，单位：元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付时间 YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 总金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutHospitalId(String outHospitalId) {
		this.outHospitalId = outHospitalId;
	}
	public String getOutHospitalId( ) {
		return this.outHospitalId;
	}

	public void setOutHospitalName(String outHospitalName) {
		this.outHospitalName = outHospitalName;
	}
	public String getOutHospitalName( ) {
		return this.outHospitalName;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
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

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
