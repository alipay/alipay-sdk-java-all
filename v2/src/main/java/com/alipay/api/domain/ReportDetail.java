package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告查询详情页
 *
 * @author auto create
 * @since 1.0, 2026-05-26 19:48:41
 */
public class ReportDetail extends AlipayObject {

	private static final long serialVersionUID = 2197798415264267142L;

	/**
	 * 报告查询详情页,h5链接
	 */
	@ApiField("report_detail_url")
	private String reportDetailUrl;

	/**
	 * 报告原件地址,必须按照页面顺序，既和页面“查看详情”安全相匹配
	 */
	@ApiField("report_ori_url")
	private String reportOriUrl;

	public String getReportDetailUrl() {
		return this.reportDetailUrl;
	}
	public void setReportDetailUrl(String reportDetailUrl) {
		this.reportDetailUrl = reportDetailUrl;
	}

	public String getReportOriUrl() {
		return this.reportOriUrl;
	}
	public void setReportOriUrl(String reportOriUrl) {
		this.reportOriUrl = reportOriUrl;
	}

}
