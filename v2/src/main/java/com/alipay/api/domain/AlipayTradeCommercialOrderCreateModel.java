package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单创建接口
 *
 * @author auto create
 * @since 1.0, 2026-05-23 15:17:49
 */
public class AlipayTradeCommercialOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6177686537894777228L;

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
	 * 支付发起方
	 */
	@ApiField("initiator_type")
	private String initiatorType;

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

	public String getInitiatorType() {
		return this.initiatorType;
	}
	public void setInitiatorType(String initiatorType) {
		this.initiatorType = initiatorType;
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
