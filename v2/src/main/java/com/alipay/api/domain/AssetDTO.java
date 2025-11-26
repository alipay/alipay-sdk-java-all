package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C资产DTO
 *
 * @author auto create
 * @since 1.0, 2025-07-02 21:06:20
 */
public class AssetDTO extends AlipayObject {

	private static final long serialVersionUID = 5897859731211637694L;

	/**
	 * 藏品创作者
	 */
	@ApiField("author_name")
	private String authorName;

	/**
	 * 序号
	 */
	@ApiField("index_id")
	private Long indexId;

	/**
	 * 藏品发行方
	 */
	@ApiField("issue_name")
	private String issueName;

	/**
	 * 缩略图URL
	 */
	@ApiField("mini_image_url")
	private String miniImageUrl;

	/**
	 * 资产nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * 藏品skuId
	 */
	@ApiField("sku_id")
	private Long skuId;

	public String getAuthorName() {
		return this.authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Long getIndexId() {
		return this.indexId;
	}
	public void setIndexId(Long indexId) {
		this.indexId = indexId;
	}

	public String getIssueName() {
		return this.issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getMiniImageUrl() {
		return this.miniImageUrl;
	}
	public void setMiniImageUrl(String miniImageUrl) {
		this.miniImageUrl = miniImageUrl;
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

}
