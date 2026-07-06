package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅扣款
 *
 * @author auto create
 * @since 1.0, 2026-06-30 16:22:57
 */
public class AlipayTradeSubscriptionPayModel extends AlipayObject {

	private static final long serialVersionUID = 4176921379475762463L;

	/**
	 * 发起扣款的交易单据超时自动关单时间，支持m（分钟）和h（小时），默认为空时命中兜底的10m
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 扩展参数，用于订阅特殊能力的传参，使用方式详见具体场景接入指南
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 商户侧外部单号，幂等键。一致则重新唤起原单支付，不一致则重新创单。注意：支卡通金额有变化时，必须创建新的外部单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 扣款总金额，商户自定义，不超过签约时协议金额（席位单价 × 席位数），单位：分，String 格式
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 订阅id，订阅唯一标识
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

}
