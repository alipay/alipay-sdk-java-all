package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗机构数据聚合计算
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:41
 */
public class AlipayCommerceMedicalInsitutionServiceSettleModel extends AlipayObject {

	private static final long serialVersionUID = 8342177499197796949L;

	/**
	 * 截止时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 指标类型
	 */
	@ApiField("indicator_type")
	private String indicatorType;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getIndicatorType() {
		return this.indicatorType;
	}
	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
