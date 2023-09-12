package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口001
 *
 * @author auto create
 * @since 1.0, 2021-09-02 02:10:21
 */
public class AlipayOpenMytestoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7217116563131827674L;

	/**
	 * 123
	 */
	@ApiField("auth")
	private ZmAuthParams auth;

	/**
	 * 拓展参数
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	public ZmAuthParams getAuth() {
		return this.auth;
	}
	public void setAuth(ZmAuthParams auth) {
		this.auth = auth;
	}

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

}
