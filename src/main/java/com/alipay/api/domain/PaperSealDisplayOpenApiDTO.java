package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纸质用印展示信息
 *
 * @author auto create
 * @since 1.0, 2021-12-27 09:32:10
 */
public class PaperSealDisplayOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 6622926762496668445L;

	/**
	 * 展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 链接地址 可空，当type为href时非空
	 */
	@ApiField("url")
	private String url;

	/**
	 * 属性值
	 */
	@ApiField("value")
	private String value;

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
