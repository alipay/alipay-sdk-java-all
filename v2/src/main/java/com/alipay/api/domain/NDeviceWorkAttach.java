package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备作业记录附件
 *
 * @author auto create
 * @since 1.0, 2025-04-24 14:58:17
 */
public class NDeviceWorkAttach extends AlipayObject {

	private static final long serialVersionUID = 5154519442919662146L;

	/**
	 * 作业附件名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * 用来描述当前上传附件的所属场景
	 */
	@ApiField("attachment_scene")
	private String attachmentScene;

	/**
	 * 作业记录上传附件类型
	 */
	@ApiField("attachment_type")
	private String attachmentType;

	/**
	 * 需通过ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("attachment_url")
	private String attachmentUrl;

	public String getAttachmentName() {
		return this.attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentScene() {
		return this.attachmentScene;
	}
	public void setAttachmentScene(String attachmentScene) {
		this.attachmentScene = attachmentScene;
	}

	public String getAttachmentType() {
		return this.attachmentType;
	}
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

}
