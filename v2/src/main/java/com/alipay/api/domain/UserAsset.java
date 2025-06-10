package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户资产信息
 *
 * @author auto create
 * @since 1.0, 2025-03-12 11:01:24
 */
public class UserAsset extends AlipayObject {

	private static final long serialVersionUID = 4345517659124297726L;

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

	public String getAuthorName() {
		return this.authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIssuerName() {
		return this.issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getMiniImagePath() {
		return this.miniImagePath;
	}
	public void setMiniImagePath(String miniImagePath) {
		this.miniImagePath = miniImagePath;
	}

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

}
