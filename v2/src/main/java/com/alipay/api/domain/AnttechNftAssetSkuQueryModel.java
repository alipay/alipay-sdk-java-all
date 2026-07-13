package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品信息查询
 *
 * @author auto create
 * @since 1.0, 2026-03-11 15:47:44
 */
public class AnttechNftAssetSkuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7848389591182399987L;

	/**
	 * 资产nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

}
