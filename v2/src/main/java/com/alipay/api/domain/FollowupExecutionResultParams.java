package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本次通话的结果结构；没有结果时返回空对象。
 *
 * @author auto create
 * @since 1.0, 2026-10-09 16:27:08
 */
public class FollowupExecutionResultParams extends AlipayObject {

	private static final long serialVersionUID = 3587411231531219377L;

	/**
	 * 具体见产品线下定义的字段
	 */
	@ApiField("params_data")
	private String paramsData;

	public String getParamsData() {
		return this.paramsData;
	}
	public void setParamsData(String paramsData) {
		this.paramsData = paramsData;
	}

}
