package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 持仓资产列表对象
 *
 * @author auto create
 * @since 1.0, 2025-03-31 10:19:44
 */
public class PageAssetDTO extends AlipayObject {

	private static final long serialVersionUID = 4439785395992853774L;

	/**
	 * 资产场景
	 */
	@ApiField("asset_scene")
	private String assetScene;

	/**
	 * 作者
	 */
	@ApiField("author_name")
	private String authorName;

	/**
	 * 发行方
	 */
	@ApiField("issuer_name")
	private String issuerName;

	/**
	 * 所属路途
	 */
	@ApiField("mini_image_path")
	private String miniImagePath;

	/**
	 * nftId资产的id
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * 接收时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * skuid  sku的专属id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * sku名称
	 */
	@ApiField("sku_name")
	private String skuName;

	public String getAssetScene() {
		return this.assetScene;
	}
	public void setAssetScene(String assetScene) {
		this.assetScene = assetScene;
	}

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

	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
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
