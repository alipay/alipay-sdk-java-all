package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品修改接口
 *
 * @author auto create
 * @since 1.0, 2023-09-11 15:20:43
 */
public class AlipayOpenAppLocalitemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7142426242989258247L;

	/**
	 * 商品属性，通过alipay.open.app.localitem.template.query获取本地商品模板信息接口得到商品属性key
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

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
	 * 商品主图 图片文件id，图片宽高为750px*750px，宽高比1:1。文件id通过alipay.open.file.upload接口上传资源获取，链接https://opendocs.alipay.com/mini/05snwo。
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 商品图片的文件id列表，不超过 3 个图片，用于商品主图的补充。图片支持jpg、jpeg、png格式，宽度及宽高比为 1:1 ，750px*750px。文件id通过alipay.open.file.upload接口上传资源获取，链接https://opendocs.alipay.com/mini/05snwo。
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
	 * 商品模版类型： 1. 团购 2. 代金
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
	 * 商品详情页URL，当C端详细页模式item_details_page_model为0（自定义详情页版）时，该字段必填
	 */
	@ApiField("path")
	private String path;

	/**
	 * sku数组
	 */
	@ApiField("skus")
	private LocalItemSkuModifyVO skus;

	/**
	 * start_time描述售卖开始时间，end_time描述售卖结束时间，时间格式均为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("sold_time")
	private TimeRangeStructVO soldTime;

	/**
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品名称只允许汉字、数字、英文字母、特殊字符集；2.商品名称不得仅为数字、字母、特殊字符集或上述三种的组合。
	 */
	@ApiField("title")
	private String title;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
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

	public LocalItemSkuModifyVO getSkus() {
		return this.skus;
	}
	public void setSkus(LocalItemSkuModifyVO skus) {
		this.skus = skus;
	}

	public TimeRangeStructVO getSoldTime() {
		return this.soldTime;
	}
	public void setSoldTime(TimeRangeStructVO soldTime) {
		this.soldTime = soldTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
