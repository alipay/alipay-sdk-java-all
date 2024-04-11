package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序整体概况数据查询
 *
 * @author auto create
 * @since 1.0, 2021-06-01 14:33:53
 */
public class AlipayOpenMiniDataSummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5212539686645531742L;

	/**
	 * 请求数据的日期
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
