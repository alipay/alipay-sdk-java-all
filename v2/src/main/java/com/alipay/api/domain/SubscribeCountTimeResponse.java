package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅套餐计次返回
 *
 * @author auto create
 * @since 1.0, 2025-09-03 19:11:49
 */
public class SubscribeCountTimeResponse extends AlipayObject {

	private static final long serialVersionUID = 5229595814737227197L;

	/**
	 * 计次是否成功
	 */
	@ApiField("count_success")
	private Boolean countSuccess;

	public Boolean getCountSuccess() {
		return this.countSuccess;
	}
	public void setCountSuccess(Boolean countSuccess) {
		this.countSuccess = countSuccess;
	}

}
