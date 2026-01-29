package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构服务明细数据批量查询
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:20:58
 */
public class AlipayCommerceMedicalInsitutionServiceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1354876257816345751L;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 指标类型
	 */
	@ApiField("indicator_type")
	private String indicatorType;

	/**
	 * 机构ID
	 */
	@ApiField("org_id")
	private String orgId;

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

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
