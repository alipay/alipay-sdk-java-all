package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品描述模型
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:46:21
 */
public class AlipayItemDescription extends AlipayObject {

	private static final long serialVersionUID = 7229352885157287676L;

	/**
	 * 标题下的描述列表
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 明细图片列表，要求图片张数小于或等于3。请勿上传过大图片，图片将会自适应至尺寸比例88:75
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 描述标题，不得超过15个中文字符
	 */
	@ApiField("title")
	private String title;

	/**
	 * 套餐使用说明链接，必须是https的地址链接
	 */
	@ApiField("url")
	private String url;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
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
