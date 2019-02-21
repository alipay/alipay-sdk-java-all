package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额宝负债端预测数据
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:50:26
 */
public class AlipayDataDataserviceYuebaolqdDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7389931641778783188L;

	/**
	 * 服务入参，格式为yyyymmdd
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
