package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductProperty;
import com.alipay.api.domain.LmCategoryVO;
import com.alipay.api.domain.MpcLmSkuVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-20 16:22:03
 */
public class AlipayCloudCloudpromoMallItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7868931743198192746L;

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
	 * 商品管控状态，表示是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/** 
	 * 商品类目链，表示从当前类目到一级类目的链路
	 */
	@ApiListField("category_chain")
	@ApiField("lm_category_v_o")
	private List<LmCategoryVO> categoryChain;

	/** 
	 * 渠道商侧类目id
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
	 * 税率，百分比
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/** 
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public void setAttr(List<ProductProperty> attr) {
		this.attr = attr;
	}
	public List<ProductProperty> getAttr( ) {
		return this.attr;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand( ) {
		return this.brand;
	}

	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}
	public Boolean getCanSell( ) {
		return this.canSell;
	}

	public void setCategoryChain(List<LmCategoryVO> categoryChain) {
		this.categoryChain = categoryChain;
	}
	public List<LmCategoryVO> getCategoryChain( ) {
		return this.categoryChain;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setDescPath(String descPath) {
		this.descPath = descPath;
	}
	public String getDescPath( ) {
		return this.descPath;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}
	public String getDivisionCode( ) {
		return this.divisionCode;
	}

	public void setFuzzyQuantity(String fuzzyQuantity) {
		this.fuzzyQuantity = fuzzyQuantity;
	}
	public String getFuzzyQuantity( ) {
		return this.fuzzyQuantity;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgUrl( ) {
		return this.imgUrl;
	}

	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
	public String getMainPic( ) {
		return this.mainPic;
	}

	public void setMpcItemId(String mpcItemId) {
		this.mpcItemId = mpcItemId;
	}
	public String getMpcItemId( ) {
		return this.mpcItemId;
	}

	public void setMpcSkuVo(List<MpcLmSkuVO> mpcSkuVo) {
		this.mpcSkuVo = mpcSkuVo;
	}
	public List<MpcLmSkuVO> getMpcSkuVo( ) {
		return this.mpcSkuVo;
	}

	public void setProductProperties(List<ProductProperty> productProperties) {
		this.productProperties = productProperties;
	}
	public List<ProductProperty> getProductProperties( ) {
		return this.productProperties;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductStatus( ) {
		return this.productStatus;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductType( ) {
		return this.productType;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setSoldQuantity(String soldQuantity) {
		this.soldQuantity = soldQuantity;
	}
	public String getSoldQuantity( ) {
		return this.soldQuantity;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getTaxCode( ) {
		return this.taxCode;
	}

	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}
	public Long getTaxRate( ) {
		return this.taxRate;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
