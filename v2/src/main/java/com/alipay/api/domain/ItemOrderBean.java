package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品订单
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:19
 */
public class ItemOrderBean extends AlipayObject {

	private static final long serialVersionUID = 6557751922356864754L;

	/**
	 * 数量：个
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 属性列表
	 */
	@ApiListField("attribute_list")
	@ApiField("attribute_bean")
	private List<AttributeBean> attributeList;

	/**
	 * 图片
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品订单ID
	 */
	@ApiField("item_order_id")
	private String itemOrderId;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商品原价,单位：元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 价格，单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量，单位：个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 加料商品列表
	 */
	@ApiListField("side_item_list")
	@ApiField("side_item_bean")
	private List<SideItemBean> sideItemList;

	/**
	 * 商品的SKU
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品快照ID
	 */
	@ApiField("snapshot_id")
	private String snapshotId;

	/**
	 * 规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 规格值，根据规格名称定义，无法给定具体单位
	 */
	@ApiField("spec_value")
	private String specValue;

	/**
	 * 缩略图
	 */
	@ApiField("thumbnail_url")
	private String thumbnailUrl;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public List<AttributeBean> getAttributeList() {
		return this.attributeList;
	}
	public void setAttributeList(List<AttributeBean> attributeList) {
		this.attributeList = attributeList;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemOrderId() {
		return this.itemOrderId;
	}
	public void setItemOrderId(String itemOrderId) {
		this.itemOrderId = itemOrderId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public List<SideItemBean> getSideItemList() {
		return this.sideItemList;
	}
	public void setSideItemList(List<SideItemBean> sideItemList) {
		this.sideItemList = sideItemList;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecValue() {
		return this.specValue;
	}
	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
