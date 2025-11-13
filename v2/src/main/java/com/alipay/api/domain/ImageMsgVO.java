package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片消息模型
 *
 * @author auto create
 * @since 1.0, 2025-03-07 16:52:55
 */
public class ImageMsgVO extends AlipayObject {

	private static final long serialVersionUID = 8266491755894895827L;

	/**
	 * 图片高度，请必须传图片真实的高度，否则客户端会按照填的宽高进行剪裁，单位为像素
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 图片文件id，请先通过图片上传接口上传图片<a href="https://opendocs.alipay.com/apis/036ros">https://opendocs.alipay.com/apis/036ros</a> 并获取到 file_id 作为这个入参的值
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 图片宽，请必须传图片真实的宽，否则客户端会按照填的宽高进行剪裁，单位为像素
	 */
	@ApiField("width")
	private Long width;

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
