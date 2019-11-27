package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot设备基础到账语音触达接口
 *
 * @author auto create
 * @since 1.0, 2019-05-21 16:19:19
 */
public class AlipayCommerceIotDeviceBasicaudioSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6593568243423826885L;

	/**
	 * 金额，当播报类型为trade时，该字段必填，用于播报到账语音的具体金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 设备唯一标识，设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 到账类型，交易支付/店内订单/外卖订单
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付来源，支付宝/微信/其他
	 */
	@ApiField("pay_source")
	private String paySource;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getPaySource() {
		return this.paySource;
	}
	public void setPaySource(String paySource) {
		this.paySource = paySource;
	}

}
