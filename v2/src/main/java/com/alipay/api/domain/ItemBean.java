package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品对象
 *
 * @author auto create
 * @since 1.0, 2025-04-11 15:38:40
 */
public class ItemBean extends AlipayObject {

	private static final long serialVersionUID = 8716413716939987995L;

	/**
	 * 属性列表
	 */
	@ApiListField("attribute_list")
	@ApiField("attribute_bean")
	private List<AttributeBean> attributeList;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品图片
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 商品优惠
	 */
	@ApiField("item_discount_sku")
	private DiscountSkuBean itemDiscountSku;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品排序
	 */
	@ApiField("item_sort")
	private Long itemSort;

	/**
	 * 商品分类ID
	 */
	@ApiField("menu_id")
	private String menuId;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原始SKU
	 */
	@ApiField("origin_sku")
	private OriginSkuBean originSku;

	/**
	 * 当前库存数量，单位：份/个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * true/false -- 当且仅当 true 时才是必选，false 或者字段不存在，都表示非必选商品
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 展示类型
	 */
	@ApiField("show_type")
	private String showType;

	/**
	 * 加料商品列表
	 */
	@ApiListField("side_item_list")
	@ApiField("side_item_bean")
	private List<SideItemBean> sideItemList;

	/**
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("sku_bean")
	private List<SkuBean> skuList;

	/**
	 * 规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 商品缩略图
	 */
	@ApiField("thumbnail_url")
	private String thumbnailUrl;

	public List<AttributeBean> getAttributeList() {
		return this.attributeList;
	}
	public void setAttributeList(List<AttributeBean> attributeList) {
		this.attributeList = attributeList;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public DiscountSkuBean getItemDiscountSku() {
		return this.itemDiscountSku;
	}
	public void setItemDiscountSku(DiscountSkuBean itemDiscountSku) {
		this.itemDiscountSku = itemDiscountSku;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getItemSort() {
		return this.itemSort;
	}
	public void setItemSort(Long itemSort) {
		this.itemSort = itemSort;
	}

	public String getMenuId() {
		return this.menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public OriginSkuBean getOriginSku() {
		return this.originSku;
	}
	public void setOriginSku(OriginSkuBean originSku) {
		this.originSku = originSku;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

	public List<SideItemBean> getSideItemList() {
		return this.sideItemList;
	}
	public void setSideItemList(List<SideItemBean> sideItemList) {
		this.sideItemList = sideItemList;
	}

	public List<SkuBean> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuBean> skuList) {
		this.skuList = skuList;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
