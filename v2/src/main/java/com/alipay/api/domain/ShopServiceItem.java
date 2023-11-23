package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线下门店的服务项目
 *
 * @author auto create
 * @since 1.0, 2020-02-29 10:44:15
 */
public class ShopServiceItem extends AlipayObject {

	private static final long serialVersionUID = 4636692573423622642L;

	/**
	 * 对服务的项目的详细描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 服务项目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务项目需要图片素材
	 */
	@ApiListField("pictures")
	@ApiField("string")
	private List<String> pictures;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

}
