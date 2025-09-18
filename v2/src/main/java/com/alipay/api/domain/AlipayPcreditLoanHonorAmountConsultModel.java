package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀已授信信息查询
 *
 * @author auto create
 * @since 1.0, 2025-09-12 17:10:29
 */
public class AlipayPcreditLoanHonorAmountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5548991927765646754L;

	/**
	 * 支付宝2088用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 荣耀用户ID
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部traceId
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * 渠道产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 首页HOME、支用表单页LEND、其他OTHERS
	 */
	@ApiField("query_scene")
	private String queryScene;

	/**
	 * 请求来源 CUSTOMER-C端对应用户发起、SCHEDULER-调度发起、BACKDOOR-小二对应后台用户调用
	 */
	@ApiField("request_source")
	private String requestSource;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQueryScene() {
		return this.queryScene;
	}
	public void setQueryScene(String queryScene) {
		this.queryScene = queryScene;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

}
