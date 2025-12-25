package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.temp.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:43
 */
public class AlipayOpenSpNcoilopenTempAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4276715777341711293L;

	/** 
	 * 业务id，与申请单id唯一对应
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 该条数据对应的唯一标识
	 */
	@ApiField("record_id")
	private String recordId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
