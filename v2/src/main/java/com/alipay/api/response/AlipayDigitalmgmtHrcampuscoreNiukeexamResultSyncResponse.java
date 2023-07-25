package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NiukeExamCallbackResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcampuscore.niukeexam.result.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:04:25
 */
public class AlipayDigitalmgmtHrcampuscoreNiukeexamResultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4441458251419228556L;

	/** 
	 * 牛客考试结果回调结果
	 */
	@ApiField("niuke_exam_callback_result")
	private NiukeExamCallbackResult niukeExamCallbackResult;

	/** 
	 * 服务调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setNiukeExamCallbackResult(NiukeExamCallbackResult niukeExamCallbackResult) {
		this.niukeExamCallbackResult = niukeExamCallbackResult;
	}
	public NiukeExamCallbackResult getNiukeExamCallbackResult( ) {
		return this.niukeExamCallbackResult;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
