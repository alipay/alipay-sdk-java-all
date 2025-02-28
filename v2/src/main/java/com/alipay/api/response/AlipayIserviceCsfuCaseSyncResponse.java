package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csfu.case.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-20 21:02:25
 */
public class AlipayIserviceCsfuCaseSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6687964773132579795L;

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
