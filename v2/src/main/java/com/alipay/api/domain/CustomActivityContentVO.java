package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义商家群活动内容模型
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:57:44
 */
public class CustomActivityContentVO extends AlipayObject {

	private static final long serialVersionUID = 1444722398944535565L;

	/**
	 * 活动跳转行动点
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 活动跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 活动描述，可以不填
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片文件id，支持的图片 jpg、jpeg、png，宽高1:1，大小小于2M，请先通过图片上传接口上传图片<a href="https://opendocs.alipay.com/apis/036ros">https://opendocs.alipay.com/apis/036ros</a>并获取到 file_id 作为这个入参的值
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 活动标题，展示在c端商家群活动的标题
	 */
	@ApiField("title")
	private String title;

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
