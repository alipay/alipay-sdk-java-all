package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定损宝车险图像定损请求中的图像信息
 *
 * @author auto create
 * @since 1.0, 2018-09-05 22:21:56
 */
public class AlipayInsDataDsbRequestImageInfo extends AlipayObject {

	private static final long serialVersionUID = 4653663736218726559L;

	/**
	 * 图像文件名称
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 图像文件在存储上的路径
	 */
	@ApiField("image_path")
	private String imagePath;

	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImagePath() {
		return this.imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
