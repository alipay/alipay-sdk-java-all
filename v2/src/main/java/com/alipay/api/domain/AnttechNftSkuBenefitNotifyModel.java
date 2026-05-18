package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品更新权益通知
 *
 * @author auto create
 * @since 1.0, 2026-04-03 17:02:44
 */
public class AnttechNftSkuBenefitNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5258289613273848187L;

	/**
	 * nft编号
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * sku编码
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
