package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文章图片
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ArticlePicture extends AlipayObject {

	private static final long serialVersionUID = 4466139452655573885L;

	/**
	 * 图片的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片上传到素材中心后生成的id
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

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

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
