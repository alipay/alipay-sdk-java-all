package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 看板数据查询对象参数
 *
 * @author auto create
 * @since 1.0, 2023-01-16 22:52:13
 */
public class BoardQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 6329827186276196163L;

	/**
	 * 人群id，人群概览查询时必传
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 只适用于资产总览查询，exclude_import=true表示查询排除导入用户后的数据看板，否则默认不排除。
	 */
	@ApiField("exclude_import")
	private Boolean excludeImport;

	/**
	 * 数据日期，格式yyyyMMdd，比如"20221230"
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public Boolean getExcludeImport() {
		return this.excludeImport;
	}
	public void setExcludeImport(Boolean excludeImport) {
		this.excludeImport = excludeImport;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
