package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参见“body_info参数说明”
1提醒类body_info固定为主副及可选布局格式
2应用类body_info固定为图文连接的格式布局
 *
 * @author auto create
 * @since 1.0, 2016-11-16 15:16:20
 */
public class MedicalSvTpCardBodyInfo extends AlipayObject {

	private static final long serialVersionUID = 2766747455672832336L;

	/**
	 * 模板消息主体主要内容题,开发者自定义
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("content")
	private String content;

	/**
	 * 模板消息主体内同图标URL
图片大小（长*宽,单位px）328*328
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 模板消息主体内容的URL链接
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 模板消息主体内容的备注
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 模板消息主体内容的副内容
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("sub_contenet")
	private String subContenet;

	/**
	 * 模板消息主体内容的副标题
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 主体内容中的标题,开发者自定义
备注：根据模板类型确定属性是否可空
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSubContenet() {
		return this.subContenet;
	}
	public void setSubContenet(String subContenet) {
		this.subContenet = subContenet;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
