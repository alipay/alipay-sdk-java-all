package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付相关参数
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:34
 */
public class IndustryPayParams extends AlipayObject {

	private static final long serialVersionUID = 5829191183725882191L;

	/**
	 * 普通异步支付, 传入该参数时，如果满足受理条件，会先同步受理支付，然后在异步调度推进支付
NORMAL_ASYNC: 普通异步，受理成功之后，会在交易关单之前通过一定的策略重试
NEAR_REAL_TIME_ASYNC: 准实时异步，受理成功之后，会准实时发起1次调度
	 */
	@ApiField("async_type")
	private String asyncType;

	public String getAsyncType() {
		return this.asyncType;
	}
	public void setAsyncType(String asyncType) {
		this.asyncType = asyncType;
	}

}
