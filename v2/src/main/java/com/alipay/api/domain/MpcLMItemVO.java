package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多端商城商品信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 18:06:33
 */
public class MpcLMItemVO extends AlipayObject {

	private static final long serialVersionUID = 7528478981788539454L;

	/**
	 * 商品规格属性，可作为商品的筛选维度
	 */
	@ApiListField("attr")
	@ApiField("product_property")
	private List<ProductProperty> attr;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 类目链
	 */
	@ApiField("category_chain")
	private LmCategoryVO categoryChain;

	/**
	 * 多端商城商品id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品详情图链接
	 */
	@ApiField("desc_path")
	private String descPath;

	/**
	 * 地区码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 模糊库存，合规要求不透出精确库存，使用模糊库存描述
	 */
	@ApiField("fuzzy_quantity")
	private String fuzzyQuantity;

	/**
	 * 商品副图链接
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 商品主图链接
	 */
	@ApiField("main_pic")
	private String mainPic;

	/**
	 * 商品id
	 */
	@ApiField("mpc_item_id")
	private String mpcItemId;

	/**
	 * sku列表
	 */
	@ApiListField("mpc_sku_vo")
	@ApiField("mpc_lm_sku_v_o")
	private List<MpcLmSkuVO> mpcSkuVo;

	/**
	 * 商品属性，是商品描述字面量
	 */
	@ApiListField("product_properties")
	@ApiField("product_property")
	private List<ProductProperty> productProperties;

	/**
	 * 商品管控状态
	 */
	@ApiField("product_status")
	private String productStatus;

	/**
	 * 商品类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 渠道店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 模糊销量
	 */
	@ApiField("sold_quantity")
	private String soldQuantity;

	/**
	 * 税码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 税率百分比
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public List<ProductProperty> getAttr() {
		return this.attr;
	}
	public void setAttr(List<ProductProperty> attr) {
		this.attr = attr;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public LmCategoryVO getCategoryChain() {
		return this.categoryChain;
	}
	public void setCategoryChain(LmCategoryVO categoryChain) {
		this.categoryChain = categoryChain;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getMainPic() {
		return this.mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}

	public String getMpcItemId() {
		return this.mpcItemId;
	}
	public void setMpcItemId(String mpcItemId) {
		this.mpcItemId = mpcItemId;
	}

	public List<MpcLmSkuVO> getMpcSkuVo() {
		return this.mpcSkuVo;
	}
	public void setMpcSkuVo(List<MpcLmSkuVO> mpcSkuVo) {
		this.mpcSkuVo = mpcSkuVo;
	}

	public List<ProductProperty> getProductProperties() {
		return this.productProperties;
	}
	public void setProductProperties(List<ProductProperty> productProperties) {
		this.productProperties = productProperties;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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
