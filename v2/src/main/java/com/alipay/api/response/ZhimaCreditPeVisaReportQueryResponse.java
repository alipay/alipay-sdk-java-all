package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.visa.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-30 09:27:37
 */
public class ZhimaCreditPeVisaReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4826387886671625436L;

	/** 
	 * 签证报告中对应的姓名拼音
	 */
	@ApiField("name_spell")
	private String nameSpell;

	/** 
	 * 签证报告对应的护照号，用于校验跟外部的护照号是否一致
	 */
	@ApiField("passport_no")
	private String passportNo;

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

	/** 
	 * 签证报告有效期时间戳
	 */
	@ApiField("valid_time")
	private String validTime;

	public void setNameSpell(String nameSpell) {
		this.nameSpell = nameSpell;
	}
	public String getNameSpell( ) {
		return this.nameSpell;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getPassportNo( ) {
		return this.passportNo;
	}

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

	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}
	public String getValidTime( ) {
		return this.validTime;
	}

}
