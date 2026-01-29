package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安诊儿驾驶舱每日明细导出
 *
 * @author auto create
 * @since 1.0, 2025-05-13 19:58:41
 */
public class AlipayCommerceMedicalInstitutionExportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7116461812427616593L;

	/**
	 * 默认传 1d
	 */
	@ApiField("aggr_day")
	private String aggrDay;

	/**
	 * 20250501代表2025年5月1号
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 上海市中医医院
	 */
	@ApiField("scc")
	private String scc;

	/**
	 * 20250501 表示2025年5月1号
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAggrDay() {
		return this.aggrDay;
	}
	public void setAggrDay(String aggrDay) {
		this.aggrDay = aggrDay;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getScc() {
		return this.scc;
	}
	public void setScc(String scc) {
		this.scc = scc;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
