package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品创建
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:39:43
 */
public class AlipayOpenAppLocalitemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3282165335592988361L;

	/**
	 * 商品属性，通过alipay.open.app.localitem.template.query获取本地商品模板信息接口得到商品属性key，is_required=1时属性必填
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 商品提报，如果需要自动推广则传此参数true，如没有这需求传false
	 */
	@ApiField("auto_marketing_delivery")
	private Boolean autoMarketingDelivery;

	/**
	 * 商品类目ID，可通过alipay.open.app.localitem.allcategory.query接口获取
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 客服电话，包含区号+电话号码的座机号码格式，以及手机号码格式
	 */
	@ApiField("customer_service_mobile")
	private PhoneStructVO customerServiceMobile;

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
	 * 1=官方插件版，商品详情页链接不传入 0=自定义详情页版，商品详情页链接必须传入
	 */
	@ApiField("item_details_page_model")
	private String itemDetailsPageModel;

	/**
	 * 商品模版类型：1. 团购 2. 代金券 3. 日历房
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	/**
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("local_item_sku_create_v_o")
	private List<LocalItemSkuCreateVO> skus;

	/**
	 * start_time描述售卖开始时间，end_time描述售卖结束时间，时间格式均为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("sold_time")
	private TimeRangeStructVO soldTime;

	/**
	 * 标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 商品名称。
商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品名称只允许汉字、数字、英文字母、特殊字符集；2.商品名称不得仅为数字、字母、特殊字符集或上述三种的组合。
	 */
	@ApiField("title")
	private String title;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public Boolean getAutoMarketingDelivery() {
		return this.autoMarketingDelivery;
	}
	public void setAutoMarketingDelivery(Boolean autoMarketingDelivery) {
		this.autoMarketingDelivery = autoMarketingDelivery;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public PhoneStructVO getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(PhoneStructVO customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
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

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	public List<LocalItemSkuCreateVO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<LocalItemSkuCreateVO> skus) {
		this.skus = skus;
	}

	public TimeRangeStructVO getSoldTime() {
		return this.soldTime;
	}
	public void setSoldTime(TimeRangeStructVO soldTime) {
		this.soldTime = soldTime;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
