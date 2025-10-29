package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品更新接口
 *
 * @author auto create
 * @since 1.0, 2025-07-24 16:45:39
 */
public class AlipayOpenAppItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4827859673755586497L;

	/**
	 * 商品属性
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 条形码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 商品业务模式，租赁业务模式包含（短租：0；长租：1）
	 */
	@ApiField("business_model")
	private String businessModel;

	/**
	 * 平台类目，填写的类目必须在类目表列出，多级类目只填最后一级。商品类目 ID 及信息可通过<a href="https://opendocs.alipay.com/b/0a8xi8">商品类目表</a>获取。仅叶子类目支持创建商品。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 导购描述，用于介绍商品卖点
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品详情信息
	 */
	@ApiField("desc_info")
	private ItemDescInfoVO descInfo;

	/**
	 * 商品立即购买链接地址
	 */
	@ApiField("direct_path")
	private String directPath;

	/**
	 * 导购信息
	 */
	@ApiListField("guide_info")
	@ApiField("guide_info_v_o")
	private List<GuideInfoVO> guideInfo;

	/**
	 * 商品主图，图片宽高为750px*750px，宽高比1:1，800kb以内。支持jpg、jpeg、png格式的图片。
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 商品子图，作为平台详情页组件的轮播图，图片宽高为750px*750px，宽高比1:1，800kb以内，不超过 3 个图片。支持jpg、jpeg、png格式的图片。
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 1=官方插件版，商品详情页链接不传入 0=自定义详情页版，商品详情页链接必须传入 当前字段已废弃(该字段下线展示，无需传入，默认填写自定义详情页版商品详情页链接)
	 */
	@ApiField("item_details_page_model")
	@Deprecated
	private String itemDetailsPageModel;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品类型，默认为实物商品
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品详情页地址
	 */
	@ApiField("path")
	private String path;

	/**
	 * 价格单元
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 商品售价，分为单位。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品的售卖状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 修改商品跳过算法检测
	 */
	@ApiField("skip_algorithm_check")
	private String skipAlgorithmCheck;

	/**
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("item_sku_v_o")
	private List<ItemSkuVO> skus;

	/**
	 * 若填写了skus[]数组，此字段不用填写。 若未填写skus[]数组，此字段选填。目前支持库存区间为0-99999999。
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 商品名称，字符类型，最少不低于3，最长不超过100个字。
	 */
	@ApiField("title")
	private String title;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBusinessModel() {
		return this.businessModel;
	}
	public void setBusinessModel(String businessModel) {
		this.businessModel = businessModel;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ItemDescInfoVO getDescInfo() {
		return this.descInfo;
	}
	public void setDescInfo(ItemDescInfoVO descInfo) {
		this.descInfo = descInfo;
	}

	public String getDirectPath() {
		return this.directPath;
	}
	public void setDirectPath(String directPath) {
		this.directPath = directPath;
	}

	public List<GuideInfoVO> getGuideInfo() {
		return this.guideInfo;
	}
	public void setGuideInfo(List<GuideInfoVO> guideInfo) {
		this.guideInfo = guideInfo;
	}

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getItemDetailsPageModel() {
		return this.itemDetailsPageModel;
	}
	public void setItemDetailsPageModel(String itemDetailsPageModel) {
		this.itemDetailsPageModel = itemDetailsPageModel;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getSkipAlgorithmCheck() {
		return this.skipAlgorithmCheck;
	}
	public void setSkipAlgorithmCheck(String skipAlgorithmCheck) {
		this.skipAlgorithmCheck = skipAlgorithmCheck;
	}

	public List<ItemSkuVO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<ItemSkuVO> skus) {
		this.skus = skus;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
