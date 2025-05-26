package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品数据变更内容
 *
 * @author auto create
 * @since 1.0, 2024-01-08 11:47:44
 */
public class AppItemDataDiffVO extends AlipayObject {

	private static final long serialVersionUID = 8446418928883435732L;

	/**
	 * 【描述】商品主图的文件id/url，图片宽高为750px*750px，宽高比1:1，800kb以内。 支持jpg、jpeg、png格式的图片。
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 商品子图，作为平台详情页组件的轮播图，图片宽高为750px*750px，宽高比1:1，800kb以内，不超过 3 个图片。 支持jpg、jpeg、png格式的图片。
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 商品售卖状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 商品sku变更内容列表
	 */
	@ApiListField("skus")
	@ApiField("app_item_sku_diff_v_o")
	private List<AppItemSkuDiffVO> skus;

	/**
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合
	 */
	@ApiField("title")
	private String title;

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

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public List<AppItemSkuDiffVO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<AppItemSkuDiffVO> skus) {
		this.skus = skus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
