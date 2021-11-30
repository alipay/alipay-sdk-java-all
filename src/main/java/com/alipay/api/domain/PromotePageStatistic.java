package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留资页统计信息
 *
 * @author auto create
 * @since 1.0, 2020-06-05 19:43:56
 */
public class PromotePageStatistic extends AlipayObject {

	private static final long serialVersionUID = 2557346652775791964L;

	/**
	 * 留资量
	 */
	@ApiField("conversion_cnt")
	private String conversionCnt;

	/**
	 * 留资页页面ID
	 */
	@ApiField("page_id")
	private String pageId;

	/**
	 * 留资页名称
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * 页面浏览pv
	 */
	@ApiField("pv")
	private String pv;

	/**
	 * 格式YYYYMMdd
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 人均停留时长(秒)
	 */
	@ApiField("residence_time")
	private String residenceTime;

	/**
	 * 页面浏览uv
	 */
	@ApiField("uv")
	private String uv;

	public String getConversionCnt() {
		return this.conversionCnt;
	}
	public void setConversionCnt(String conversionCnt) {
		this.conversionCnt = conversionCnt;
	}

	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPv() {
		return this.pv;
	}
	public void setPv(String pv) {
		this.pv = pv;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getResidenceTime() {
		return this.residenceTime;
	}
	public void setResidenceTime(String residenceTime) {
		this.residenceTime = residenceTime;
	}

	public String getUv() {
		return this.uv;
	}
	public void setUv(String uv) {
		this.uv = uv;
	}

}
