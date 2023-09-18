package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违规记录详情查询
 *
 * @author auto create
 * @since 1.0, 2023-07-24 15:26:50
 */
public class AlipayOpenViolationViolationdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7818996613687712124L;

	/**
	 * 支付宝侧生成的违规记录唯一标识
	 */
	@ApiField("violation_record_id")
	private String violationRecordId;

	public String getViolationRecordId() {
		return this.violationRecordId;
	}
	public void setViolationRecordId(String violationRecordId) {
		this.violationRecordId = violationRecordId;
	}

}
