package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.asset.sku.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-11 15:47:44
 */
public class AnttechNftAssetSkuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5648628362733768549L;

	/** 
	 * 藏品作者
	 */
	@ApiField("author")
	private String author;

	/** 
	 * 发行方
	 */
	@ApiField("issuer")
	private String issuer;

	/** 
	 * 资产nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	/** 
	 * 藏品哈希值
	 */
	@ApiField("sku_hash")
	private String skuHash;

	/** 
	 * 藏品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/** 
	 * 藏品标颜色
	 */
	@ApiField("sku_label_color")
	private String skuLabelColor;

	/** 
	 * 作品名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/** 
	 * 藏品缩略图链接
	 */
	@ApiField("thumbnail")
	private String thumbnail;

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor( ) {
		return this.author;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getIssuer( ) {
		return this.issuer;
	}

	public void setNftId(String nftId) {
		this.nftId = nftId;
	}
	public String getNftId( ) {
		return this.nftId;
	}

	public void setSkuHash(String skuHash) {
		this.skuHash = skuHash;
	}
	public String getSkuHash( ) {
		return this.skuHash;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

	public void setSkuLabelColor(String skuLabelColor) {
		this.skuLabelColor = skuLabelColor;
	}
	public String getSkuLabelColor( ) {
		return this.skuLabelColor;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getSkuName( ) {
		return this.skuName;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getThumbnail( ) {
		return this.thumbnail;
	}

}
