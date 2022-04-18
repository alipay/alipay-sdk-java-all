package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品资源项
 *
 * @author auto create
 * @since 1.0, 2019-08-20 16:42:35
 */
public class ProdResource extends AlipayObject {

	private static final long serialVersionUID = 1748242453564791961L;

	/**
	 * 资源项唯一标识
	 */
	@ApiField("key")
	private String key;

	/**
	 * 资源项名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 资源项类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 资源向内容
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
