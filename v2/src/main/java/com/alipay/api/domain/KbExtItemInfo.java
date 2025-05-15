package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商品信息（关联品牌，品类）
 *
 * @author auto create
 * @since 1.0, 2017-09-25 14:11:31
 */
public class KbExtItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4569969948384426221L;

	/**
	 * 品牌信息（目前支持3级品牌）
	 */
	@ApiListField("brand_level_info_list")
	@ApiField("brand_level_info")
	private List<BrandLevelInfo> brandLevelInfoList;

	/**
	 * 商品简述：对商品的简要说明，吸引顾客的描述（非必填）
	 */
	@ApiField("brief")
	private String brief;

	/**
	 * 品类列表信息（目前支持5级品类）
	 */
	@ApiListField("category_level_info_list")
	@ApiField("category_level_info")
	private List<CategoryLevelInfo> categoryLevelInfoList;

	/**
	 * 入数，必须为整数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 产地
	 */
	@ApiField("country")
	private String country;

	/**
	 * 币种，采用ISO 4217 Currency Codes编码，表示该商品售价对应的货币种类：CNY/USD 等
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 店内货号：商户店铺内自行对商品的编码
	 */
	@ApiField("inner_goods_id")
	private String innerGoodsId;

	/**
	 * 商品规格:900ml/500克/12瓶装
	 */
	@ApiField("item_format")
	private String itemFormat;

	/**
	 * 包装：描述该商品的包装形式：盒装/瓶装/袋装/散装
	 */
	@ApiField("pack")
	private String pack;

	/**
	 * 商品图片file_id列表（最多30张）
	 */
	@ApiListField("picture_id_list")
	@ApiField("string")
	private List<String> pictureIdList;

	/**
	 * 参考价格，单位（分），必须为整数
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品描述
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 表示该商品的售卖单位，对单价的补充说明个/箱/盒/克/公斤 等
	 */
	@ApiField("unit")
	private String unit;

	public List<BrandLevelInfo> getBrandLevelInfoList() {
		return this.brandLevelInfoList;
	}
	public void setBrandLevelInfoList(List<BrandLevelInfo> brandLevelInfoList) {
		this.brandLevelInfoList = brandLevelInfoList;
	}

	public String getBrief() {
		return this.brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public List<CategoryLevelInfo> getCategoryLevelInfoList() {
		return this.categoryLevelInfoList;
	}
	public void setCategoryLevelInfoList(List<CategoryLevelInfo> categoryLevelInfoList) {
		this.categoryLevelInfoList = categoryLevelInfoList;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getInnerGoodsId() {
		return this.innerGoodsId;
	}
	public void setInnerGoodsId(String innerGoodsId) {
		this.innerGoodsId = innerGoodsId;
	}

	public String getItemFormat() {
		return this.itemFormat;
	}
	public void setItemFormat(String itemFormat) {
		this.itemFormat = itemFormat;
	}

	public String getPack() {
		return this.pack;
	}
	public void setPack(String pack) {
		this.pack = pack;
	}

	public List<String> getPictureIdList() {
		return this.pictureIdList;
	}
	public void setPictureIdList(List<String> pictureIdList) {
		this.pictureIdList = pictureIdList;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
