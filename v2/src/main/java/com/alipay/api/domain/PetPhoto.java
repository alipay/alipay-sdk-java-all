package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台宠物档案，宠物照片
 *
 * @author auto create
 * @since 1.0, 2022-06-21 14:40:46
 */
public class PetPhoto extends AlipayObject {

	private static final long serialVersionUID = 3625189796883695224L;

	/**
	 * 宠物照片类型，
NOSE("nose", "鼻纹照"),
FACE("face", "正脸照");
	 */
	@ApiField("type")
	private String type;

	/**
	 * 宠物照片地址
	 */
	@ApiField("url")
	private String url;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
