package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道商商品sku信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:29:10
 */
public class LinkedMallSkuDTO extends AlipayObject {

	private static final long serialVersionUID = 7734938942353386674L;

	/**
	 * 69码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * sku是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * sku地区码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * sku模糊库存
	 */
	@ApiField("fuzzy_quantity")
	private String fuzzyQuantity;

	/**
	 * 划线价，单位分
	 */
	@ApiField("mark_price")
	private Long markPrice;

	/**
	 * sku主图
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 天猫店铺侧的商品当前售卖价（不保证实时性仅参考）
	 */
	@ApiField("platform_price")
	private String platformPrice;

	/**
	 * 采购供货价，单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * sku所属商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 21000017
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku规格
	 */
	@ApiListField("sku_specs")
	@ApiField("sku_spec")
	private List<SkuSpec> skuSpecs;

	/**
	 * 规格码
	 */
	@ApiField("sku_specs_code")
	private String skuSpecsCode;

	/**
	 * sku管控状态
	 */
	@ApiField("sku_status")
	private String skuStatus;

	/**
	 * sku标题
	 */
	@ApiField("title")
	private String title;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getFuzzyQuantity() {
		return this.fuzzyQuantity;
	}
	public void setFuzzyQuantity(String fuzzyQuantity) {
		this.fuzzyQuantity = fuzzyQuantity;
	}

	public Long getMarkPrice() {
		return this.markPrice;
	}
	public void setMarkPrice(Long markPrice) {
		this.markPrice = markPrice;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPlatformPrice() {
		return this.platformPrice;
	}
	public void setPlatformPrice(String platformPrice) {
		this.platformPrice = platformPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public List<SkuSpec> getSkuSpecs() {
		return this.skuSpecs;
	}
	public void setSkuSpecs(List<SkuSpec> skuSpecs) {
		this.skuSpecs = skuSpecs;
	}

	public String getSkuSpecsCode() {
		return this.skuSpecsCode;
	}
	public void setSkuSpecsCode(String skuSpecsCode) {
		this.skuSpecsCode = skuSpecsCode;
	}

	public String getSkuStatus() {
		return this.skuStatus;
	}
	public void setSkuStatus(String skuStatus) {
		this.skuStatus = skuStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
