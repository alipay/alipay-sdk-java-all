package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐投保产品的资源信息
 *
 * @author auto create
 * @since 1.0, 2026-07-24 14:14:12
 */
public class OfflineLaborRecomInsuranceResource extends AlipayObject {

	private static final long serialVersionUID = 8527148273595231679L;

	/**
	 * 投保须知
	 */
	@ApiField("key")
	private String key;

	/**
	 * 资源名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 资源类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 资源内容
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
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

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
