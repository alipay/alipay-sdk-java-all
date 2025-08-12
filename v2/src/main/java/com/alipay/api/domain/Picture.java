package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class Picture extends AlipayObject {

	private static final long serialVersionUID = 2768489651277776932L;

	/**
	 * 调用alipay.offline.material.image.upload接口将图片上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

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

}
