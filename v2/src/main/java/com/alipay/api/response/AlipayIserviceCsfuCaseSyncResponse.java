package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csfu.case.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 15:54:52
 */
public class AlipayIserviceCsfuCaseSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5814879453184437226L;

	/** 
	 * 同步案件后返回的主键id
	 */
	@ApiField("data_id")
	private Long dataId;

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}
	public Long getDataId( ) {
		return this.dataId;
	}

}
