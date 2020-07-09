package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易信用支付准入咨询
 *
 * @author auto create
 * @since 1.0, 2020-03-11 17:33:40
 */
public class AlipayTradeCreditPayConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6215357462185398981L;

	/**
	 * 标识买家授信额度的来源
	 */
	@ApiField("buyer_credit_source")
	private String buyerCreditSource;

	/**
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 标识商家授信额度的来源，具体的值由支付宝定义
	 */
	@ApiField("merchant_credit_source")
	private String merchantCreditSource;

	/**
	 * 交易金额,单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易买家的userId
	 */
	@ApiField("trade_buyer_id")
	private String tradeBuyerId;

	/**
	 * 交易卖家的userId
	 */
	@ApiField("trade_seller_id")
	private String tradeSellerId;

	public String getBuyerCreditSource() {
		return this.buyerCreditSource;
	}
	public void setBuyerCreditSource(String buyerCreditSource) {
		this.buyerCreditSource = buyerCreditSource;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getMerchantCreditSource() {
		return this.merchantCreditSource;
	}
	public void setMerchantCreditSource(String merchantCreditSource) {
		this.merchantCreditSource = merchantCreditSource;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeBuyerId() {
		return this.tradeBuyerId;
	}
	public void setTradeBuyerId(String tradeBuyerId) {
		this.tradeBuyerId = tradeBuyerId;
	}

	public String getTradeSellerId() {
		return this.tradeSellerId;
	}
	public void setTradeSellerId(String tradeSellerId) {
		this.tradeSellerId = tradeSellerId;
	}

}
