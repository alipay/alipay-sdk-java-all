package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ViolationEvent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.violation.violationevent.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-24 16:27:03
 */
public class AlipayOpenViolationViolationeventBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5839853453818983962L;

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
