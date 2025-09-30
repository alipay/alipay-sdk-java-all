package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义商品详情
 *
 * @author auto create
 * @since 1.0, 2025-05-30 14:58:12
 */
public class CustomGoodsVO extends AlipayObject {

	private static final long serialVersionUID = 7767753268915131168L;

	/**
	 * 商品的售卖价格，单位：元，精确到小数点后两位数字。
	 */
	@ApiField("activity_price")
	private String activityPrice;

	/**
	 * 支持.jpg,.png格式，图片宽高比1:1，2M以内。请先通过图片上传接口上传图片，并获取到 file_id 作为这个入参的值。
【注意事项】支持.jpg,.png格式，图片宽高比1:1，2M以内
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 商品的原始价格，单位：元，精确到小数点后两位数
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 返回该商品的标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 商品的名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品详情的跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getActivityPrice() {
		return this.activityPrice;
	}
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
