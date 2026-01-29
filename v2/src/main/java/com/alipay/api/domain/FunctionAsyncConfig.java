package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 异步配置
 *
 * @author auto create
 * @since 1.0, 2023-12-21 17:47:41
 */
public class FunctionAsyncConfig extends AlipayObject {

	private static final long serialVersionUID = 7718963335376779183L;

	/**
	 * 失败回调，如回调云函数
	 */
	@ApiField("on_failure")
	private AsyncConfigDestination onFailure;

	/**
	 * 成功回调，如回调云函数
	 */
	@ApiField("on_success")
	private AsyncConfigDestination onSuccess;

	public AsyncConfigDestination getOnFailure() {
		return this.onFailure;
	}
	public void setOnFailure(AsyncConfigDestination onFailure) {
		this.onFailure = onFailure;
	}

	public AsyncConfigDestination getOnSuccess() {
		return this.onSuccess;
	}
	public void setOnSuccess(AsyncConfigDestination onSuccess) {
		this.onSuccess = onSuccess;
	}

}
