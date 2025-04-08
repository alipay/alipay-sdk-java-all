package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据nftId查询nft资产信息
 *
 * @author auto create
 * @since 1.0, 2025-03-31 10:21:11
 */
public class AnttechNftBaseinfoNftidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2493135869738517275L;

	/**
	 * 资产唯一编码
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
