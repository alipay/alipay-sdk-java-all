package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试错误码验证接口
 *
 * @author auto create
 * @since 1.0, 2023-06-28 16:04:30
 */
public class AlipayOpenOperationOpenbizmockTesterrorcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2429827786547847799L;

	/**
	 * 测试
	 */
	@ApiField("key")
	private String key;

	/**
	 * 测试
	 */
	@ApiField("keykey")
	private String keykey;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getKeykey() {
		return this.keykey;
	}
	public void setKeykey(String keykey) {
		this.keykey = keykey;
	}

}
