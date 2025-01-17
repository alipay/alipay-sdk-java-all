package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 激励交易回传
 *
 * @author auto create
 * @since 1.0, 2024-12-23 17:20:55
 */
public class AlipayCommerceLogisticsTradeEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8641459437451971326L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 小件员用户标识
	 */
	@ApiField("expressman_open_id")
	private String expressmanOpenId;

	/**
	 * 小件员支付宝用户id
	 */
	@ApiField("expressman_user_id")
	private String expressmanUserId;

	/**
	 * 激励码值
	 */
	@ApiField("incentive_code")
	private String incentiveCode;

	/**
	 * 商户标识（接口调用方的渠道编码，由支付宝分配）
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * ALIPAY 支付宝操作渠道
OTHER 其他渠道
	 */
	@ApiField("operation_source")
	private String operationSource;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付者用户标识
	 */
	@ApiField("pay_open_id")
	private String payOpenId;

	/**
	 * 支付者支付宝用户id
	 */
	@ApiField("pay_user_id")
	private String payUserId;

	/**
	 * 商户侧运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getExpressmanOpenId() {
		return this.expressmanOpenId;
	}
	public void setExpressmanOpenId(String expressmanOpenId) {
		this.expressmanOpenId = expressmanOpenId;
	}

	public String getExpressmanUserId() {
		return this.expressmanUserId;
	}
	public void setExpressmanUserId(String expressmanUserId) {
		this.expressmanUserId = expressmanUserId;
	}

	public String getIncentiveCode() {
		return this.incentiveCode;
	}
	public void setIncentiveCode(String incentiveCode) {
		this.incentiveCode = incentiveCode;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOperationSource() {
		return this.operationSource;
	}
	public void setOperationSource(String operationSource) {
		this.operationSource = operationSource;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayOpenId() {
		return this.payOpenId;
	}
	public void setPayOpenId(String payOpenId) {
		this.payOpenId = payOpenId;
	}

	public String getPayUserId() {
		return this.payUserId;
	}
	public void setPayUserId(String payUserId) {
		this.payUserId = payUserId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
