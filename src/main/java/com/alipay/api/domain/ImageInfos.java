package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 算法入参图片信息
 *
 * @author auto create
 * @since 1.0, 2022-04-27 20:54:31
 */
public class ImageInfos extends AlipayObject {

	private static final long serialVersionUID = 2353438218933988154L;

	/**
	 * 图片aftsId或者url
	 */
	@ApiField("image")
	private String image;

	/**
	 * 传入图片类型
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 图片数据md5值
	 */
	@ApiField("md_5")
	private String md5;

	/**
	 * 图片数据标识名
	 */
	@ApiField("name")
	private String name;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getMd5() {
		return this.md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
