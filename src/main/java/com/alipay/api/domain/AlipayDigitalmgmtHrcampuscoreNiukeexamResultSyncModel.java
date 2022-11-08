package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁校招流程hrrcprocedure牛客笔试成绩回调接口
 *
 * @author auto create
 * @since 1.0, 2022-07-01 21:35:19
 */
public class AlipayDigitalmgmtHrcampuscoreNiukeexamResultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1395673518248256127L;

	/**
	 * 牛客回调参数请求对象
	 */
	@ApiField("niuke_exam_callback_request")
	private NiukeExamCallbackRequest niukeExamCallbackRequest;

	public NiukeExamCallbackRequest getNiukeExamCallbackRequest() {
		return this.niukeExamCallbackRequest;
	}
	public void setNiukeExamCallbackRequest(NiukeExamCallbackRequest niukeExamCallbackRequest) {
		this.niukeExamCallbackRequest = niukeExamCallbackRequest;
	}

}
