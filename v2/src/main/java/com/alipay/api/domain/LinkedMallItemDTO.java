package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道商商品详情
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:29:15
 */
public class LinkedMallItemDTO extends AlipayObject {

	private static final long serialVersionUID = 2314553542935177461L;

	/**
	 * 商品品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商品是否可售，true-可售，false-禁售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 商品所属叶子类目到根类目的路径
	 */
	@ApiListField("category_chain")
	@ApiField("lm_category_v_o")
	private List<LmCategoryVO> categoryChain;

	/**
	 * 商品类目id
	 */
	@ApiField("category_leaf_id")
	private String categoryLeafId;

	/**
	 * 描述链接
	 */
	@ApiField("desc_path")
	private String descPath;

	/**
	 * 商品地区码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 渠道商商品模糊库存
	 */
	@ApiField("fuzzy_quantity")
	private String fuzzyQuantity;

	/**
	 * 商品副图链接
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 商品主图链接，从oss获取
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品规格，是商品的辅助筛选维度
	 */
	@ApiListField("product_specs")
	@ApiField("linked_mall_item_spec_d_t_o")
	private List<LinkedMallItemSpecDTO> productSpecs;

	/**
	 * 商品的上架状态
	 */
	@ApiField("product_status")
	private String productStatus;

	/**
	 * 商品类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 商品属性，是商品的描述字面量，仅用于展示
	 */
	@ApiListField("properties")
	@ApiField("linked_mall_item_prop_d_t_o")
	private List<LinkedMallItemPropDTO> properties;

	/**
	 * 商品库存
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 渠道店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品sku信息
	 */
	@ApiListField("skus")
	@ApiField("linked_mall_sku_d_t_o")
	private List<LinkedMallSkuDTO> skus;

	/**
	 * 模糊销量
	 */
	@ApiField("sold_quantity")
	private String soldQuantity;

	/**
	 * 商品税码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 百分位税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public List<LmCategoryVO> getCategoryChain() {
		return this.categoryChain;
	}
	public void setCategoryChain(List<LmCategoryVO> categoryChain) {
		this.categoryChain = categoryChain;
	}

	public String getCategoryLeafId() {
		return this.categoryLeafId;
	}
	public void setCategoryLeafId(String categoryLeafId) {
		this.categoryLeafId = categoryLeafId;
	}

	public String getDescPath() {
		return this.descPath;
	}
	public void setDescPath(String descPath) {
		this.descPath = descPath;
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

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<LinkedMallItemSpecDTO> getProductSpecs() {
		return this.productSpecs;
	}
	public void setProductSpecs(List<LinkedMallItemSpecDTO> productSpecs) {
		this.productSpecs = productSpecs;
	}

	public String getProductStatus() {
		return this.productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public List<LinkedMallItemPropDTO> getProperties() {
		return this.properties;
	}
	public void setProperties(List<LinkedMallItemPropDTO> properties) {
		this.properties = properties;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<LinkedMallSkuDTO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<LinkedMallSkuDTO> skus) {
		this.skus = skus;
	}

	public String getSoldQuantity() {
		return this.soldQuantity;
	}
	public void setSoldQuantity(String soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
