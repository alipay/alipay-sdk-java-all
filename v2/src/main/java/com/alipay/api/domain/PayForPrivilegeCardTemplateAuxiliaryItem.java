package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板辅助区域项目
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:53:57
 */
public class PayForPrivilegeCardTemplateAuxiliaryItem extends AlipayObject {

	private static final long serialVersionUID = 1163545662472435663L;

	/**
	 * 该辅助区域项目的唯一标识
	 */
	@ApiField("key")
	private String key;

	/**
	 * 该辅助区域项目的展示文字
	 */
	@ApiField("label")
	private String label;

	/**
	 * 该辅助区域项目的类型，可选值包括 openWeb(跳转), text(文本)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 该辅助区域项目的跳转链接，当type为openweb的时候必填
	 */
	@ApiField("url")
	private String url;

	/**
	 * 该辅助区域项目的文字描述信息，出现在label的右侧，对label的辅助信息展示
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
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
