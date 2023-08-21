package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐商品信息模型
 *
 * @author auto create
 * @since 1.0, 2020-07-02 10:57:18
 */
public class CircleRecommendItemDTO extends AlipayObject {

	private static final long serialVersionUID = 5167975691937985855L;

	/**
	 * 生活圈aoi信息
	 */
	@ApiField("aoi_info")
	private AoiInfoDTO aoiInfo;

	/**
	 * 商品折扣
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 商品主图/封面图
	 */
	@ApiField("item_cover")
	private String itemCover;

	/**
	 * 商品详情链接，根据入参display_channel信息，获取对应端小程序链接，默认支付宝小程序链接
	 */
	@ApiField("item_detail_url")
	private String itemDetailUrl;

	/**
	 * 商品Id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品标签（三选一：新品/爆品/超赞）
	 */
	@ApiField("item_label")
	private String itemLabel;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品所属门店信息
	 */
	@ApiField("item_store")
	private ItemStoreDTO itemStore;

	/**
	 * 商品原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 销量 “已售xxx份”，销量大于9999："已售XX万份"
	 */
	@ApiField("sales_info")
	private String salesInfo;

	/**
	 * 节省X元，originalPrice - salesPrice
	 */
	@ApiField("saved_money")
	private String savedMoney;

	/**
	 * 描述：节省X元
	 */
	@ApiField("saved_money_info")
	private String savedMoneyInfo;

	/**
	 * 商品售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 商品总销量
	 */
	@ApiField("sold_quantity")
	private String soldQuantity;

	/**
	 * 商品所属门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public AoiInfoDTO getAoiInfo() {
		return this.aoiInfo;
	}
	public void setAoiInfo(AoiInfoDTO aoiInfo) {
		this.aoiInfo = aoiInfo;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getItemCover() {
		return this.itemCover;
	}
	public void setItemCover(String itemCover) {
		this.itemCover = itemCover;
	}

	public String getItemDetailUrl() {
		return this.itemDetailUrl;
	}
	public void setItemDetailUrl(String itemDetailUrl) {
		this.itemDetailUrl = itemDetailUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemLabel() {
		return this.itemLabel;
	}
	public void setItemLabel(String itemLabel) {
		this.itemLabel = itemLabel;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemStoreDTO getItemStore() {
		return this.itemStore;
	}
	public void setItemStore(ItemStoreDTO itemStore) {
		this.itemStore = itemStore;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getSalesInfo() {
		return this.salesInfo;
	}
	public void setSalesInfo(String salesInfo) {
		this.salesInfo = salesInfo;
	}

	public String getSavedMoney() {
		return this.savedMoney;
	}
	public void setSavedMoney(String savedMoney) {
		this.savedMoney = savedMoney;
	}

	public String getSavedMoneyInfo() {
		return this.savedMoneyInfo;
	}
	public void setSavedMoneyInfo(String savedMoneyInfo) {
		this.savedMoneyInfo = savedMoneyInfo;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSoldQuantity() {
		return this.soldQuantity;
	}
	public void setSoldQuantity(String soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
