package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀临额相关信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:26:24
 */
public class HonorTempLimitInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1772921589385549751L;

	/**
	 * 临额可用额度，单位：分
	 */
	@ApiField("temp_available_limit")
	private String tempAvailableLimit;

	/**
	 * 临额授信额度，单位：分
	 */
	@ApiField("temp_credit_limit")
	private String tempCreditLimit;

	/**
	 * 临额有效期(截止时间), 示例:   2023-09-23 23:59:59
	 */
	@ApiField("temp_limit_valid_time")
	private Date tempLimitValidTime;

	public String getTempAvailableLimit() {
		return this.tempAvailableLimit;
	}
	public void setTempAvailableLimit(String tempAvailableLimit) {
		this.tempAvailableLimit = tempAvailableLimit;
	}

	public String getTempCreditLimit() {
		return this.tempCreditLimit;
	}
	public void setTempCreditLimit(String tempCreditLimit) {
		this.tempCreditLimit = tempCreditLimit;
	}

	public Date getTempLimitValidTime() {
		return this.tempLimitValidTime;
	}
	public void setTempLimitValidTime(Date tempLimitValidTime) {
		this.tempLimitValidTime = tempLimitValidTime;
	}

}
