package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品
 *
 * @author auto create
 * @since 1.0, 2022-12-23 14:25:17
 */
public class ItemVO extends AlipayObject {

	private static final long serialVersionUID = 3737562115748375488L;

	/**
	 * 条形码信息，应用于扫一扫场景
	 */
	@ApiField("barcode_info")
	private BarcodeInfoVO barcodeInfo;

	/**
	 * 能否被搜索，可被搜索（true）,不可被搜索（false），默认true可以被搜索
	 */
	@ApiField("can_be_search")
	private String canBeSearch;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品特征json字符串
	 */
	@ApiField("feature")
	private String feature;

	/**
	 * 是否有价格：true-有价格，false-无价格
	 */
	@ApiField("has_price")
	private Boolean hasPrice;

	/**
	 * 详情图url列表，不超过3个图片
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 商家侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品主图
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 商品原价，分为单位。has_price为true时才可能有值
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 平台类目
	 */
	@ApiField("platform_category")
	private ItemCategoryVO platformCategory;

	/**
	 * 平台侧商品id
	 */
	@ApiField("platform_item_id")
	private String platformItemId;

	/**
	 * 商品价格，分为单位。has_price为true时才有值
	 */
	@ApiField("price")
	private String price;

	/**
	 * 价格单元，在has_price为true时可设置。和商品价格、商品原价（数值的单位保持为分）配合使用，扩展单位描述。枚举值：元、元/小时、元/日、元/周、元/月、元/季、元/年、元/次、元/场、元起、m2。
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品详情页URL
	 */
	@ApiField("src_path")
	private String srcPath;

	/**
	 * 商品售卖状态，售罄(SOLD_OUT),冻结(FREEZE) 可售(AVAILABLE)
	 */
	@ApiField("stock_status")
	private String stockStatus;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public BarcodeInfoVO getBarcodeInfo() {
		return this.barcodeInfo;
	}
	public void setBarcodeInfo(BarcodeInfoVO barcodeInfo) {
		this.barcodeInfo = barcodeInfo;
	}

	public String getCanBeSearch() {
		return this.canBeSearch;
	}
	public void setCanBeSearch(String canBeSearch) {
		this.canBeSearch = canBeSearch;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}

	public Boolean getHasPrice() {
		return this.hasPrice;
	}
	public void setHasPrice(Boolean hasPrice) {
		this.hasPrice = hasPrice;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public ItemCategoryVO getPlatformCategory() {
		return this.platformCategory;
	}
	public void setPlatformCategory(ItemCategoryVO platformCategory) {
		this.platformCategory = platformCategory;
	}

	public String getPlatformItemId() {
		return this.platformItemId;
	}
	public void setPlatformItemId(String platformItemId) {
		this.platformItemId = platformItemId;
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

	public String getSrcPath() {
		return this.srcPath;
	}
	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getStockStatus() {
		return this.stockStatus;
	}
	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
