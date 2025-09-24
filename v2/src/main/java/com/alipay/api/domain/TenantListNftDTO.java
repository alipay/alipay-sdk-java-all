package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户上架资产信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 21:06:52
 */
public class TenantListNftDTO extends AlipayObject {

	private static final long serialVersionUID = 1852846648866533791L;

	/**
	 * 藏品上架金额(单位：分)
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 藏品NFTID
	 */
	@ApiField("nft_id")
	private String nftId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

}
