package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业搜索BOX商品同步
 *
 * @author auto create
 * @since 1.0, 2024-07-23 15:30:51
 */
public class AlipayCommerceSearchboxItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4444285887371337644L;

	/**
	 * 商品所属类目，注意类目需先完成提报及审核；建议长度控制在 128 字符之内
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品描述，仅用于部分业务场景，参考对接文档
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 商户内部商品id，类目下唯一
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品图片素材url，通过图片上传接口获取
	 */
	@ApiField("item_image")
	private String itemImage;

	/**
	 * 运营管理后台使用，不对客展示
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 类目下正序排列；默认排序仅在其他排序规则不生效时使用，规则参考业务接入文档
	 */
	@ApiField("item_order")
	private Long itemOrder;

	/**
	 * 对客展示用，传参规则见业务对接文档
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 商品下单或充值页链接
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 商品原价（元），即划线价，仅用于部分业务场景，参考对接文档，单位：元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品售价（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 仅用于部分业务场景，参考对接文档；参考单位：元/季、元/件、元/日
	 */
	@ApiField("price_unit")
	private String priceUnit;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemImage() {
		return this.itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemOrder() {
		return this.itemOrder;
	}
	public void setItemOrder(Long itemOrder) {
		this.itemOrder = itemOrder;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

}
