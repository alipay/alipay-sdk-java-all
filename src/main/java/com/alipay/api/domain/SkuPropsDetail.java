package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku属性信息
 *
 * @author auto create
 * @since 1.0, 2022-03-18 18:06:32
 */
public class SkuPropsDetail extends AlipayObject {

	private static final long serialVersionUID = 6389138269956554112L;

	/**
	 * 属性对于等图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 属性值名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 属性id
	 */
	@ApiField("vid")
	private String vid;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
