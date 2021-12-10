package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户打标接口失败的匹配器
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:27:29
 */
public class ErrorMatcher extends AlipayObject {

	private static final long serialVersionUID = 4474646142142162274L;

	/**
	 * 失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 用户打标接口出错的匹配器
	 */
	@ApiField("matcher")
	private Matcher matcher;

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Matcher getMatcher() {
		return this.matcher;
	}
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
