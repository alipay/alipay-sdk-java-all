package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前置营销优惠咨询
 *
 * @author auto create
 * @since 1.0, 2023-09-26 11:23:24
 */
public class AlipayMarketingActivityDeductConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6682778842982322894L;

	/**
	 * 券指定的核销appid（如果配券时指定了核销范围为线上小程序及相应的appid则此处必传）
	 */
	@ApiField("available_app_id")
	private String availableAppId;

	/**
	 * 支付宝平台渠道承接信息。用户从公域会场、直播等场景跳转时会携带这部分信息，商户需要获取并传入。
	 */
	@ApiField("mini_trace_info")
	private String miniTraceInfo;

	/**
	 * 订单金额（如同时享受商户自有优惠请先扣除后传入），单位为元，最多2位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	public String getAvailableAppId() {
		return this.availableAppId;
	}
	public void setAvailableAppId(String availableAppId) {
		this.availableAppId = availableAppId;
	}

	public String getMiniTraceInfo() {
		return this.miniTraceInfo;
	}
	public void setMiniTraceInfo(String miniTraceInfo) {
		this.miniTraceInfo = miniTraceInfo;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

}
