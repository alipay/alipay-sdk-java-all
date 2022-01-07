package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表创建及更新接口
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:31:40
 */
public class KoubeiMarketingDataCustomreportSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8676743516543362414L;

	/**
	 * 自定义报表规则条件信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

	public CustomReportCondition getReportConditionInfo() {
		return this.reportConditionInfo;
	}
	public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}

}
