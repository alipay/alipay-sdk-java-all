package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-25 15:22:32
 */
public class ReportConfigVO extends AlipayObject {

	private static final long serialVersionUID = 6612995565498119151L;

	/**
	 * null
	 */
	@ApiListField("job_codes")
	@ApiField("string")
	private List<String> jobCodes;

	/**
	 * 自定义跳转地址
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 上报类型
	 */
	@ApiField("report_type")
	private String reportType;

	public List<String> getJobCodes() {
		return this.jobCodes;
	}
	public void setJobCodes(List<String> jobCodes) {
		this.jobCodes = jobCodes;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}
