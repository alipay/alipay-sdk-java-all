package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容图片
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ContentPicture extends AlipayObject {

	private static final long serialVersionUID = 3412372256737932446L;

	/**
	 * 调用alipay.offline.material.image.upload，将图片上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * "DISH"："菜品"，"ENVIRONMENT"："环境"，"SHOPHEAD"："门头照"，"OTHER"："其他"
	 */
	@ApiField("type")
	private String type;

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
