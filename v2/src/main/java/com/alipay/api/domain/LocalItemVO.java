package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地商品
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:39:24
 */
public class LocalItemVO extends AlipayObject {

	private static final long serialVersionUID = 5876811328986868752L;

	/**
	 * 商品属性
	 */
	@ApiField("attrs")
	private AppItemAttrVO attrs;

	/**
	 * 平台类目，填写的类目必须在类目表列出，多级类目只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 客服电话，包含区号+电话号码的座机号码格式，以及手机号码格式
	 */
	@ApiField("customer_service_mobile")
	private PhoneStructVO customerServiceMobile;

	/**
	 * 商品主图链接
	 */
	@ApiField("head_img")
	private String headImg;

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
	 * 商品模版类型： 1. 团购 2. 代金 3. 次卡
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商家侧商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品详情页链接
	 */
	@ApiField("path")
	private String path;

	/**
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("local_item_sku_query_v_o")
	private List<LocalItemSkuQueryVO> skus;

	/**
	 * start_time描述售卖开始时间，end_time描述售卖结束时间，时间格式均为YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("sold_time")
	private TimeRangeStructVO soldTime;

	/**
	 * 标品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。 审核中：商品处于审核流程中时，商品状态为审核中。 已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。 可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。 冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，spu的商品状态则为“可售卖”。
	 */
	@ApiField("spu_status")
	private String spuStatus;

	/**
	 * 库存
	 */
	@ApiField("stock_num")
	private String stockNum;

	/**
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
	 */
	@ApiField("title")
	private String title;

	public AppItemAttrVO getAttrs() {
		return this.attrs;
	}
	public void setAttrs(AppItemAttrVO attrs) {
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

	public List<LocalItemSkuQueryVO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<LocalItemSkuQueryVO> skus) {
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

	public String getSpuStatus() {
		return this.spuStatus;
	}
	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}

	public String getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
