package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连模式获取购买链接
 *
 * @author auto create
 * @since 1.0, 2026-09-25 14:47:53
 */
public class AlipayAipayNowpaydirectPurchaseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8427353319728592392L;

	/**
	 * 购买完成返回地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 外部买家会员id
	 */
	@ApiField("external_buyer_id")
	private String externalBuyerId;

	/**
	 * 商品外部id，可从小程序商品详情页获取
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 购买外部请求号，用于幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 可选，希望直接指定购买档位时可传入
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getExternalBuyerId() {
		return this.externalBuyerId;
	}
	public void setExternalBuyerId(String externalBuyerId) {
		this.externalBuyerId = externalBuyerId;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
