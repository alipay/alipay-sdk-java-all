package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸图片，描述了一张人脸图片的相关信息
 *
 * @author auto create
 * @since 1.0, 2015-08-24 20:14:35
 */
public class FaceImage extends AlipayObject {

	private static final long serialVersionUID = 4842556861145459742L;

	/**
	 * base64编码的图片内容，图片格式为jpg
	 */
	@ApiField("content")
	private String content;

	/**
	 * 人脸高度	int	人脸在照片中的高度	可空
	 */
	@ApiField("face_rect_height")
	private Long faceRectHeight;

	/**
	 * 人脸宽度	int	人脸在照片中的宽度	可空
	 */
	@ApiField("face_rect_width")
	private Long faceRectWidth;

	/**
	 * 人脸坐标x	int	人脸在照片中的起点位置坐标x	可空
	 */
	@ApiField("face_rect_x")
	private Long faceRectX;

	/**
	 * 人脸坐标y	int	人脸在照片中的起点位置坐标y	可空
	 */
	@ApiField("face_rect_y")
	private Long faceRectY;

	/**
	 * 人脸图片类型：高清正面、动作、头像
	 */
	@ApiField("img_type")
	private String imgType;

	/**
	 * 照片质量	int	人脸在照片的质量分	可空
	 */
	@ApiField("quality")
	private Long quality;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getFaceRectHeight() {
		return this.faceRectHeight;
	}
	public void setFaceRectHeight(Long faceRectHeight) {
		this.faceRectHeight = faceRectHeight;
	}

	public Long getFaceRectWidth() {
		return this.faceRectWidth;
	}
	public void setFaceRectWidth(Long faceRectWidth) {
		this.faceRectWidth = faceRectWidth;
	}

	public Long getFaceRectX() {
		return this.faceRectX;
	}
	public void setFaceRectX(Long faceRectX) {
		this.faceRectX = faceRectX;
	}

	public Long getFaceRectY() {
		return this.faceRectY;
	}
	public void setFaceRectY(Long faceRectY) {
		this.faceRectY = faceRectY;
	}

	public String getImgType() {
		return this.imgType;
	}
	public void setImgType(String imgType) {
		this.imgType = imgType;
	}

	public Long getQuality() {
		return this.quality;
	}
	public void setQuality(Long quality) {
		this.quality = quality;
	}

}
