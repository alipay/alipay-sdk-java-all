package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货评估结果
 *
 * @author auto create
 * @since 1.0, 2026-07-15 19:12:52
 */
public class ShipAssessmentResultVO extends AlipayObject {

	private static final long serialVersionUID = 2327465675922753639L;

	/**
	 * 错误原因，当发货评估结果为null时返回
	 */
	@ApiField("error_reason")
	private String errorReason;

	/**
	 * 发货建议 true-建议发货，false-不建议发货
	 */
	@ApiField("ship_advice")
	private Boolean shipAdvice;

	public String getErrorReason() {
		return this.errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public Boolean getShipAdvice() {
		return this.shipAdvice;
	}
	public void setShipAdvice(Boolean shipAdvice) {
		this.shipAdvice = shipAdvice;
	}

}
