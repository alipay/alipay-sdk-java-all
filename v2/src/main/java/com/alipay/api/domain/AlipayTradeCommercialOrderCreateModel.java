package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单创建接口
 *
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:56
 */
public class AlipayTradeCommercialOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2895947187867495831L;

	/**
	 * agent类型，当intiator_type=AGENT时必传
	 */
	@ApiField("agent_type")
	private String agentType;

	/**
	 * 本次支付关联的客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 扩展参数，JSON 格式字符串，包含企业支付等扩展信息
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 支付发起方
	 */
	@ApiField("initiator_type")
	private String initiatorType;

	/**
	 * 订单金额（单位：分），灵活定价模式下必填
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/**
	 * 商品列表页code，在后台配置获取
	 */
	@ApiField("page_code")
	private String pageCode;

	/**
	 * 本次支付关联的价格实例ID
	 */
	@ApiField("price_id")
	private String priceId;

	/**
	 * 订单支付成功后回跳地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 用户支付的收银台UI模式
	 */
	@ApiField("ui_mode")
	private String uiMode;

	public String getAgentType() {
		return this.agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getInitiatorType() {
		return this.initiatorType;
	}
	public void setInitiatorType(String initiatorType) {
		this.initiatorType = initiatorType;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPageCode() {
		return this.pageCode;
	}
	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

	public String getPriceId() {
		return this.priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getUiMode() {
		return this.uiMode;
	}
	public void setUiMode(String uiMode) {
		this.uiMode = uiMode;
	}

}
