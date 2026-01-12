package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告识别结果
 *
 * @author auto create
 * @since 1.0, 2025-04-01 15:47:01
 */
public class ReportResult extends AlipayObject {

	private static final long serialVersionUID = 7573712482226738694L;

	/**
	 * 病例总结
	 */
	@ApiField("case_summary")
	private String caseSummary;

	/**
	 * KV抽取
	 */
	@ApiField("kv")
	private String kv;

	/**
	 * 报告类型
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 报告子类别
	 */
	@ApiField("sub_type")
	private String subType;

	public String getCaseSummary() {
		return this.caseSummary;
	}
	public void setCaseSummary(String caseSummary) {
		this.caseSummary = caseSummary;
	}

	public String getKv() {
		return this.kv;
	}
	public void setKv(String kv) {
		this.kv = kv;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

}
