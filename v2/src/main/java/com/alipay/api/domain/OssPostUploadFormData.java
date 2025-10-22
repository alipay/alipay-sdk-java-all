package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OSS POST Form上传参数
 *
 * @author auto create
 * @since 1.0, 2023-09-01 15:34:17
 */
public class OssPostUploadFormData extends AlipayObject {

	private static final long serialVersionUID = 8715553513927778676L;

	/**
	 * POST Form上传表单的参数名
	 */
	@ApiField("key")
	private String key;

	/**
	 * POST Form上传的参数值。
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
