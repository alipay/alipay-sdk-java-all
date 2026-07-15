package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager单笔支付接口
 *
 * @author auto create
 * @since 1.0, 2026-07-14 11:02:02
 */
public class AlipayVoyagerPaymentsPayModel extends AlipayObject {

	private static final long serialVersionUID = 2796442133625477623L;

	/**
	 * 环境信息
	 */
	@ApiField("env")
	private VoyagerEnvInfo env;

	/**
	 * 过期时间，UTC+8，ISO 8601格式
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 行业标识，字段类型与请求参数对应
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 飞猪分配的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单信息
	 */
	@ApiField("order")
	private VoyagerOrderInfoDTO order;

	/**
	 * 支付金额
	 */
	@ApiField("payment_amount")
	private MultiCurrencyMoneyDTO paymentAmount;

	/**
	 * 支付方式
	 */
	@ApiField("payment_method")
	private VoyagerPaymentMethod paymentMethod;

	/**
	 * 支付完成回执地址（飞猪回调地址）
	 */
	@ApiField("payment_notify_url")
	private String paymentNotifyUrl;

	/**
	 * 支付成功跳转地址
	 */
	@ApiField("payment_redirect_url")
	private String paymentRedirectUrl;

	/**
	 * 支付请求ID，幂等key
	 */
	@ApiField("payment_request_id")
	private String paymentRequestId;

	/**
	 * 支付结算策略
	 */
	@ApiField("settlement_strategy")
	private SettlementStrategyDTO settlementStrategy;

	public VoyagerEnvInfo getEnv() {
		return this.env;
	}
	public void setEnv(VoyagerEnvInfo env) {
		this.env = env;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public VoyagerOrderInfoDTO getOrder() {
		return this.order;
	}
	public void setOrder(VoyagerOrderInfoDTO order) {
		this.order = order;
	}

	public MultiCurrencyMoneyDTO getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(MultiCurrencyMoneyDTO paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public VoyagerPaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(VoyagerPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentNotifyUrl() {
		return this.paymentNotifyUrl;
	}
	public void setPaymentNotifyUrl(String paymentNotifyUrl) {
		this.paymentNotifyUrl = paymentNotifyUrl;
	}

	public String getPaymentRedirectUrl() {
		return this.paymentRedirectUrl;
	}
	public void setPaymentRedirectUrl(String paymentRedirectUrl) {
		this.paymentRedirectUrl = paymentRedirectUrl;
	}

	public String getPaymentRequestId() {
		return this.paymentRequestId;
	}
	public void setPaymentRequestId(String paymentRequestId) {
		this.paymentRequestId = paymentRequestId;
	}

	public SettlementStrategyDTO getSettlementStrategy() {
		return this.settlementStrategy;
	}
	public void setSettlementStrategy(SettlementStrategyDTO settlementStrategy) {
		this.settlementStrategy = settlementStrategy;
	}

}
