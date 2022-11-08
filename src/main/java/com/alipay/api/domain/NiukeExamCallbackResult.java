package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 牛客考试结果回调结果
 *
 * @author auto create
 * @since 1.0, 2022-06-06 10:52:14
 */
public class NiukeExamCallbackResult extends AlipayObject {

	private static final long serialVersionUID = 3158653666587241226L;

	/**
	 * 调用结果
	 */
	@ApiField("result")
	private String result;

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
