package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品更新接口
 *
 * @author auto create
 * @since 1.0, 2023-08-18 14:13:51
 */
public class AlipayOpenAppItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5719747489919819546L;

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
	 * 平台类目，填写的类目必须在类目表列出，多级类目只填最后一级。商品类目 ID 及信息可通过<a href="https://opendocs.alipay.com/b/07847b">商品类目表</a>获取。仅叶子类目支持创建商品。
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
	 * 商品主图的文件id，图片宽高为750px*750px，宽高比1:1，500kb以内。 支持jpg、jpeg、png格式的图片。文件id通过alipay.open.file.upload上传资源获取
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 商品图片的文件id列表，不超过 3 个图片，用于商品主图的补充。图片支持jpg、jpeg、png格式，宽度及宽高比为 1:1 ，750px*750px。文件id通过alipay.open.file.upload上传资源获取
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 1=官方插件版，商品详情页链接不传入 0=自定义详情页版，商品详情页链接必须传入
	 */
	@ApiField("item_details_page_model")
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
	 * 商品原价，分为单位。若填写了skus[]数组，此字段不用填写。若未填写skus[]数组，此字段必填。如果填写，值必须大于0，且原价不能小于售价。
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
	 * 商品售价，分为单位。若填写了skus[]数组，此字段不用填写。若未填写skus[]数组，此字段必填。如果填写，值必须要大于0。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品的售卖状态，包含以下两种状态
已下架(DELISTING)
可售卖(AVAILABLE)
若填写了skus[]数组，此字段不用填写。
若未填写skus[]数组，此字段必填。
	 */
	@ApiField("sale_status")
	private String saleStatus;

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
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
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
