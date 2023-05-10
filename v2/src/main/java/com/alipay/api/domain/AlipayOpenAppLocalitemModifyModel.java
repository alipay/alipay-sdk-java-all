package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品修改接口
 *
 * @author auto create
 * @since 1.0, 2023-05-10 16:42:07
 */
public class AlipayOpenAppLocalitemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2284897862423327278L;

	/**
	 * 商品属性
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 商品类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品主图。图片文件id，图片宽高为750px*750px，宽高比1:1。文件id通过alipay.open.file.upload上传资源获取。
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
	@ApiField("skus")
	private LocalItemSkuModifyVO skus;

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

	public LocalItemSkuModifyVO getSkus() {
		return this.skus;
	}
	public void setSkus(LocalItemSkuModifyVO skus) {
		this.skus = skus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
