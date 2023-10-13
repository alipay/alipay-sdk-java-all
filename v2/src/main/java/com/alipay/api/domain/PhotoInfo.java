package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌的logo图片信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:40:04
 */
public class PhotoInfo extends AlipayObject {

	private static final long serialVersionUID = 4271317259668929756L;

	/**
	 * 图片高度
	 */
	@ApiField("img_height")
	private Long imgHeight;

	/**
	 * 图片的宽
	 */
	@ApiField("img_width")
	private Long imgWidth;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 图片大小
	 */
	@ApiField("photo_size")
	private Long photoSize;

	/**
	 * 图片上传后的key
	 */
	@ApiField("photo_url")
	private String photoUrl;

	public Long getImgHeight() {
		return this.imgHeight;
	}
	public void setImgHeight(Long imgHeight) {
		this.imgHeight = imgHeight;
	}

	public Long getImgWidth() {
		return this.imgWidth;
	}
	public void setImgWidth(Long imgWidth) {
		this.imgWidth = imgWidth;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPhotoSize() {
		return this.photoSize;
	}
	public void setPhotoSize(Long photoSize) {
		this.photoSize = photoSize;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
