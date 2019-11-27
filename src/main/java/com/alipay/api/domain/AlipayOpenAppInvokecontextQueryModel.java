package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公有云应用查询请求上下文
 *
 * @author auto create
 * @since 1.0, 2017-12-19 15:25:23
 */
public class AlipayOpenAppInvokecontextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4768723462366276595L;

	/**
	 * 域外平台appId_上下文invokeId
	 */
	@ApiField("invoke_context_key")
	private String invokeContextKey;

	public String getInvokeContextKey() {
		return this.invokeContextKey;
	}
	public void setInvokeContextKey(String invokeContextKey) {
		this.invokeContextKey = invokeContextKey;
	}

}
