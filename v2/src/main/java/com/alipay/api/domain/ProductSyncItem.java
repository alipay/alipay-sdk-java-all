package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家同步活动商品
 *
 * @author auto create
 * @since 1.0, 2026-08-18 15:21:24
 */
public class ProductSyncItem extends AlipayObject {

	private static final long serialVersionUID = 4166194547643423887L;

	/**
	 * 商家商品编码与商品条码二选一必填
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 商品语音播报，只能满足40文字表述
	 */
	@ApiField("marketing_voice_text")
	private String marketingVoiceText;

	/**
	 * 商家商品编码与商品条码二选一必填
	 */
	@ApiField("merchant_product_code")
	private String merchantProductCode;

	/**
	 * 原价，单位元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品图片fileId，支持格式：PNG，需要无背景的商品图片，用于生成活动海报等
	 */
	@ApiField("product_image_file_id")
	private String productImageFileId;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 活动价，单位元
	 */
	@ApiField("promotion_price")
	private String promotionPrice;

	/**
	 * 商品规格
	 */
	@ApiField("specification")
	private String specification;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getMarketingVoiceText() {
		return this.marketingVoiceText;
	}
	public void setMarketingVoiceText(String marketingVoiceText) {
		this.marketingVoiceText = marketingVoiceText;
	}

	public String getMerchantProductCode() {
		return this.merchantProductCode;
	}
	public void setMerchantProductCode(String merchantProductCode) {
		this.merchantProductCode = merchantProductCode;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getProductImageFileId() {
		return this.productImageFileId;
	}
	public void setProductImageFileId(String productImageFileId) {
		this.productImageFileId = productImageFileId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPromotionPrice() {
		return this.promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

}
