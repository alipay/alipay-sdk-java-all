package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ViolationEvent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.violation.violationevent.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:47:20
 */
public class AlipayOpenViolationViolationeventBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4235313668727623312L;

	/** 
	 * 违规记录列表
	 */
	@ApiField("violation_record_infos")
	private ViolationEvent violationRecordInfos;

	public void setViolationRecordInfos(ViolationEvent violationRecordInfos) {
		this.violationRecordInfos = violationRecordInfos;
	}
	public ViolationEvent getViolationRecordInfos( ) {
		return this.violationRecordInfos;
	}

}
