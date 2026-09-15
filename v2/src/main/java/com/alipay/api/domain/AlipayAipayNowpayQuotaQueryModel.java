package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询次数或积分余额
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:52
 */
public class AlipayAipayNowpayQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6668637435591832163L;

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
