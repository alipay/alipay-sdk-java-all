package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地商品
 *
 * @author auto create
 * @since 1.0, 2023-05-04 14:45:36
 */
public class LocalItemVO extends AlipayObject {

	private static final long serialVersionUID = 7781117251928584211L;

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
	 * 商品主图链接
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品模版类型： 1. 团购套餐 2. 代金券
	 */
	@ApiField("item_type")
	private String itemType;

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

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
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
