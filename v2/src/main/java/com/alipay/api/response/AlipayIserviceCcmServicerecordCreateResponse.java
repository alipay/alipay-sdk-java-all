package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.servicerecord.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-09 16:26:37
 */
public class AlipayIserviceCcmServicerecordCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3573985344357413661L;

	/** 
	 * 服务记录ID
	 */
	@ApiField("service_record_id")
	private String serviceRecordId;

	public void setServiceRecordId(String serviceRecordId) {
		this.serviceRecordId = serviceRecordId;
	}
	public String getServiceRecordId( ) {
		return this.serviceRecordId;
	}

}
