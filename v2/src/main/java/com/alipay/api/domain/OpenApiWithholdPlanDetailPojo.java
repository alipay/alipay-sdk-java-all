package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划详情
 *
 * @author auto create
 * @since 1.0, 2024-12-27 15:48:28
 */
public class OpenApiWithholdPlanDetailPojo extends AlipayObject {

	private static final long serialVersionUID = 6776934893134967542L;

	/**
	 * 还款期数，1表示第一期
	 */
	@ApiField("period_no")
	private Long periodNo;

	/**
	 * 本期待换金额（单位分）
	 */
	@ApiField("to_repay_amount")
	private Long toRepayAmount;

	/**
	 * 代扣日期
	 */
	@ApiField("withhold_date")
	private Date withholdDate;

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

	public Long getToRepayAmount() {
		return this.toRepayAmount;
	}
	public void setToRepayAmount(Long toRepayAmount) {
		this.toRepayAmount = toRepayAmount;
	}

	public Date getWithholdDate() {
		return this.withholdDate;
	}
	public void setWithholdDate(Date withholdDate) {
		this.withholdDate = withholdDate;
	}

}
