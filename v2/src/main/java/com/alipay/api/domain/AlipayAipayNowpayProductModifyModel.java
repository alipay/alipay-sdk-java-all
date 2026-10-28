package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改商品基础信息
 *
 * @author auto create
 * @since 1.0, 2026-10-20 10:28:01
 */
public class AlipayAipayNowpayProductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7595926898632231124L;

	/**
	 * 外部平台商品所有者标识
	 */
	@ApiField("external_owner_id")
	private String externalOwnerId;

	/**
	 * 外部平台商品/应用标识
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 新简短描述
	 */
	@ApiField("product_description")
	private String productDescription;

	/**
	 * 新图标地址
	 */
	@ApiField("product_icon_url")
	private String productIconUrl;

	/**
	 * 新商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 新商品详情地址
	 */
	@ApiField("product_url")
	private String productUrl;

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

	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductIconUrl() {
		return this.productIconUrl;
	}
	public void setProductIconUrl(String productIconUrl) {
		this.productIconUrl = productIconUrl;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductUrl() {
		return this.productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

}
