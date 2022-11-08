package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系附件信息
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:29:31
 */
public class BusinessRelationAttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 2741774952623357364L;

	/**
	 * 附件类型
	 */
	@ApiField("attachment_type")
	private String attachmentType;

	/**
	 * 图片id，需使用图片上传接口上传图片后得到的 image_id
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 协议失效时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/**
	 * 协议生效时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_time")
	private String validTime;

	public String getAttachmentType() {
		return this.attachmentType;
	}
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getInvalidTime() {
		return this.invalidTime;
	}
	public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getValidTime() {
		return this.validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}
