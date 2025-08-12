package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连服务商小蓝环作业商户报表链接查询
 *
 * @author auto create
 * @since 1.0, 2025-06-10 16:33:09
 */
public class AlipayOfflineProviderCoilWorkreporturlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3573721184957159219L;

	/**
	 * 用于指定某一天的全量报表，由于每日数据产出时效为T+1，通常传入T日日期查询最新报表，例如2025年5月1日的数据会在2025年5月2日产出，传入20250501以查询最新报表
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
