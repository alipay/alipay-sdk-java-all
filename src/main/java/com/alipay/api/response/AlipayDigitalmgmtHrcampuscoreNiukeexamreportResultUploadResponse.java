package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NiukeExamReportCallbackResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcampuscore.niukeexamreport.result.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-01 21:36:54
 */
public class AlipayDigitalmgmtHrcampuscoreNiukeexamreportResultUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7532964768552532411L;

	/** 
	 * 牛客笔试报告回调结果
	 */
	@ApiField("niuke_exam_report_callback_result")
	private NiukeExamReportCallbackResult niukeExamReportCallbackResult;

	/** 
	 * 服务调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setNiukeExamReportCallbackResult(NiukeExamReportCallbackResult niukeExamReportCallbackResult) {
		this.niukeExamReportCallbackResult = niukeExamReportCallbackResult;
	}
	public NiukeExamReportCallbackResult getNiukeExamReportCallbackResult( ) {
		return this.niukeExamReportCallbackResult;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
