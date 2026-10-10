package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件链接查询服务
 *
 * @author auto create
 * @since 1.0, 2026-09-26 15:57:18
 */
public class AlipayCommerceMedicalHdfAttachQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3239996695247255799L;

	/**
	 * 附件ID
	 */
	@ApiField("attachment_id")
	private String attachmentId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 超时时间ms
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 高度px
	 */
	@ApiField("height")
	private String height;

	/**
	 * 图片格式：jpg、jpeg、png、gif、bmp、webp、tiff、svg、ico、avif、heic等
	 */
	@ApiField("img_format")
	private String imgFormat;

	/**
	 * 宽度px
	 */
	@ApiField("width")
	private String width;

	public String getAttachmentId() {
		return this.attachmentId;
	}
	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getImgFormat() {
		return this.imgFormat;
	}
	public void setImgFormat(String imgFormat) {
		this.imgFormat = imgFormat;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
