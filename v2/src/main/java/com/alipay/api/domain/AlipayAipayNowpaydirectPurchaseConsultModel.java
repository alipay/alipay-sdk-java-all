package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连模式查询买断或时长访问决策
 *
 * @author auto create
 * @since 1.0, 2026-09-29 13:37:54
 */
public class AlipayAipayNowpaydirectPurchaseConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3379937485533396858L;

	/**
	 * 购买完成返回地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 外部会员id，业务侧的用户标识
	 */
	@ApiField("external_buyer_id")
	private String externalBuyerId;

	/**
	 * 外部商品id，小程序商品详情页获取
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

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

}
