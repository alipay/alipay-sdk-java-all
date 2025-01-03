package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.call.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-25 17:42:17
 */
public class AlipayCloudCloudpromoMessageCallCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7182369272398994583L;

	/** 
	 * 智能触达时记录ID，用于查询触达结果
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
