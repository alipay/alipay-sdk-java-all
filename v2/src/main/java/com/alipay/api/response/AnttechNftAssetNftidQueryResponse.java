package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.asset.nftid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:42:27
 */
public class AnttechNftAssetNftidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2383479335515364395L;

	/** 
	 * NFT的创作者名称
	 */
	@ApiField("author_name")
	private String authorName;

	/** 
	 * NFT的发行方名称
	 */
	@ApiField("issuer_name")
	private String issuerName;

	/** 
	 * 缩略图url
	 */
	@ApiField("mini_image_path")
	private String miniImagePath;

	/** 
	 * NFT资产的唯一编码
	 */
	@ApiField("nft_id")
	private String nftId;

	/** 
	 * NFT商品的商品编码
	 */
	@ApiField("sku_id")
	private Long skuId;

	/** 
	 * NFT商品的名称
	 */
	@ApiField("sku_name")
	private String skuName;

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorName( ) {
		return this.authorName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public String getIssuerName( ) {
		return this.issuerName;
	}

	public void setMiniImagePath(String miniImagePath) {
		this.miniImagePath = miniImagePath;
	}
	public String getMiniImagePath( ) {
		return this.miniImagePath;
	}

	public void setNftId(String nftId) {
		this.nftId = nftId;
	}
	public String getNftId( ) {
		return this.nftId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getSkuId( ) {
		return this.skuId;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getSkuName( ) {
		return this.skuName;
	}

}
