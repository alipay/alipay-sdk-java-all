package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.visa.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:59
 */
public class ZhimaCreditPeVisaReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8875514222219416837L;

	/** 
	 * 用户签证报告申请状态，枚举字段：
生效中 VALID 
已失效 INVALID 
不存在 NOT_EXIST
	 */
	@ApiField("report_apply_status")
	private String reportApplyStatus;

	/** 
	 * 签证报告文件内容，仅返回用户申请的最新一份有效报告。需要先base64解码，获取原始byte[]类型文件流。
	 */
	@ApiListField("report_content_files")
	@ApiField("string")
	private List<String> reportContentFiles;

	/** 
	 * 用户是否准入，当前主要指用户是否满足申请的分数门槛。
	 */
	@ApiField("user_permit_status")
	private Boolean userPermitStatus;

	public void setReportApplyStatus(String reportApplyStatus) {
		this.reportApplyStatus = reportApplyStatus;
	}
	public String getReportApplyStatus( ) {
		return this.reportApplyStatus;
	}

	public void setReportContentFiles(List<String> reportContentFiles) {
		this.reportContentFiles = reportContentFiles;
	}
	public List<String> getReportContentFiles( ) {
		return this.reportContentFiles;
	}

	public void setUserPermitStatus(Boolean userPermitStatus) {
		this.userPermitStatus = userPermitStatus;
	}
	public Boolean getUserPermitStatus( ) {
		return this.userPermitStatus;
	}

}
