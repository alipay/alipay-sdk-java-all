package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的使用说明描述
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
public class VoucherDescDetail extends AlipayObject {

	private static final long serialVersionUID = 3154736388673265966L;

	/**
	 * 具体描述信息列表
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 图片描述信息
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 券说明的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 券外部详情描述
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
