package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:43
 */
public class ObjectFieldInfo extends AlipayObject {

	private static final long serialVersionUID = 4494919635895665472L;

	/**
	 * 属性key，如是否医保等，必须在对象库字段表里存在
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值，如 true；上传图片时，先使用 alipay.open.file.upload 接口上传文件，返回 file_id 后通过这个值传入
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
