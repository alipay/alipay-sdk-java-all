package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业商品提报上传
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:59:02
 */
public class AlipayCommerceCommonItemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1225281352766372227L;

	/**
	 * 行业商品信息，对应不同的扩展属性模型
	 */
	@ApiListField("biz_item_info")
	@ApiField("ext_info_pair")
	private List<ExtInfoPair> bizItemInfo;

	/**
	 * 行业商品类型，对应不同的扩展属性模型
	 */
	@ApiField("biz_item_type")
	private String bizItemType;

	/**
	 * 标识商品提报的场景类型
电商 ：ECOMMERCE_CAMP
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝商品类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品的投放信息
	 */
	@ApiField("delivery_infos")
	private ItemDeliveryInfoSyncRequest deliveryInfos;

	/**
	 * 扩展属性，具体字段sop给出
	 */
	@ApiListField("ext_info")
	@ApiField("ext_info_pair")
	private List<ExtInfoPair> extInfo;

	/**
	 * 商品的描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 商品的售卖亮点
	 */
	@ApiListField("item_highlight_list")
	@ApiField("string")
	private List<String> itemHighlightList;

	/**
	 * 商家侧商品id，同appId下唯一
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品的副图的集合，调用alipay.open.file.upload得到的fileId
	 */
	@ApiListField("item_image_list")
	@ApiField("string")
	private List<String> itemImageList;

	/**
	 * 商品的主图通过alipay.open.file.upload上传得到的fileId
	 */
	@ApiField("item_main_image")
	private String itemMainImage;

	/**
	 * 管理商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品自定义属性，list<kv>类型
	 */
	@ApiListField("item_spec_list")
	@ApiField("ext_info_pair")
	private List<ExtInfoPair> itemSpecList;

	/**
	 * 商品标题，商品c端透出名称
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 点击商品跳转的详情页url
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 商品的原价（划线价），单位分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商品价格，单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品价格类型（元/件、元/次、元/日、元/季），透出在c端
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品营销信息
	 */
	@ApiField("promo_infos")
	private ItemPromoInfoSyncRequest promoInfos;

	/**
	 * 商品上下架状态，DELISTING：下架，AVAILABLE：上架
	 */
	@ApiField("sell_status")
	private String sellStatus;

	/**
	 * 商品sku集合
	 */
	@ApiListField("sku_list")
	@ApiField("industry_item_sku_sync_request")
	private List<IndustryItemSkuSyncRequest> skuList;

	/**
	 * 商品的库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public List<ExtInfoPair> getBizItemInfo() {
		return this.bizItemInfo;
	}
	public void setBizItemInfo(List<ExtInfoPair> bizItemInfo) {
		this.bizItemInfo = bizItemInfo;
	}

	public String getBizItemType() {
		return this.bizItemType;
	}
	public void setBizItemType(String bizItemType) {
		this.bizItemType = bizItemType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public ItemDeliveryInfoSyncRequest getDeliveryInfos() {
		return this.deliveryInfos;
	}
	public void setDeliveryInfos(ItemDeliveryInfoSyncRequest deliveryInfos) {
		this.deliveryInfos = deliveryInfos;
	}

	public List<ExtInfoPair> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ExtInfoPair> extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public List<String> getItemHighlightList() {
		return this.itemHighlightList;
	}
	public void setItemHighlightList(List<String> itemHighlightList) {
		this.itemHighlightList = itemHighlightList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<String> getItemImageList() {
		return this.itemImageList;
	}
	public void setItemImageList(List<String> itemImageList) {
		this.itemImageList = itemImageList;
	}

	public String getItemMainImage() {
		return this.itemMainImage;
	}
	public void setItemMainImage(String itemMainImage) {
		this.itemMainImage = itemMainImage;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<ExtInfoPair> getItemSpecList() {
		return this.itemSpecList;
	}
	public void setItemSpecList(List<ExtInfoPair> itemSpecList) {
		this.itemSpecList = itemSpecList;
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

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public ItemPromoInfoSyncRequest getPromoInfos() {
		return this.promoInfos;
	}
	public void setPromoInfos(ItemPromoInfoSyncRequest promoInfos) {
		this.promoInfos = promoInfos;
	}

	public String getSellStatus() {
		return this.sellStatus;
	}
	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}

	public List<IndustryItemSkuSyncRequest> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<IndustryItemSkuSyncRequest> skuList) {
		this.skuList = skuList;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
