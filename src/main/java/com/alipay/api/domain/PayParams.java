package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付相关参数
 *
 * @author auto create
 * @since 1.0, 2021-12-08 20:41:31
 */
public class PayParams extends AlipayObject {

	private static final long serialVersionUID = 8329371365178263735L;

	/**
	 * 普通异步支付, 传入该参数时，如果满足受理条件，会先同步受理支付，然后在异步调度推进支付

NORMAL_ASYNC: 普通异步，受理成功之后，会在交易关单之前通过一定的策略重试

NEAR_REAL_TIME_ASYNC: 准实时异步，受理成功之后，会准实时发起1次调度
	 */
	@ApiField("async_type")
	private String asyncType;

	/**
	 * 重试类型，当async_type传入NORMAL_ASYNC时，可以设置该参数，选择是否要重试，retry_type 可选，不设置时，可重试。
● NONE_AND_CLOSETRADE：不重试，支付请求只会被执行1次，执行完成后如果交易未成功，会关闭交易
● NONE：不重试，支付请求只会被执行1次，执行完成后，不做任何处理。交易到达了timeout_express指定的时间后，关闭交易。
● RETY: 重试，支付请求在超时关单前，会按照策略重试
	 */
	@ApiField("retry_type")
	private String retryType;

	public String getAsyncType() {
		return this.asyncType;
	}
	public void setAsyncType(String asyncType) {
		this.asyncType = asyncType;
	}

	public String getRetryType() {
		return this.retryType;
	}
	public void setRetryType(String retryType) {
		this.retryType = retryType;
	}

}
