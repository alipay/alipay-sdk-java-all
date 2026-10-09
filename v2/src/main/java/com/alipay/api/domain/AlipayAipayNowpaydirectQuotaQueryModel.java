package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连模式查询次数或积分余额
 *
 * @author auto create
 * @since 1.0, 2026-09-29 11:12:56
 */
public class AlipayAipayNowpaydirectQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5196477446529449548L;

	/**
	 * 外部会员id
	 */
	@ApiField("external_buyer_id")
	private String externalBuyerId;

	/**
	 * 外部商品id，可在小程序商品详情页获取
	 */
	@ApiField("out_product_id")
	private String outProductId;

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
