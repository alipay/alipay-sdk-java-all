package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询买断或时长访问决策
 *
 * @author auto create
 * @since 1.0, 2026-09-02 20:12:53
 */
public class AlipayAipayNowpayPurchaseConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7728393166417726528L;

	/**
	 * 购买完成返回地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 权益受益人
	 */
	@ApiField("external_buyer_id")
	private String externalBuyerId;

	/**
	 * 商品所有者
	 */
	@ApiField("external_owner_id")
	private String externalOwnerId;

	/**
	 * 商品/应用标识
	 */
	@ApiField("out_product_id")
	private String outProductId;

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

	public String getExternalOwnerId() {
		return this.externalOwnerId;
	}
	public void setExternalOwnerId(String externalOwnerId) {
		this.externalOwnerId = externalOwnerId;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

}
