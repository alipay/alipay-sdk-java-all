package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.clue.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 15:22:50
 */
public class AlipayIserviceCcmCrmClueModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3574596381566379775L;

	/** 
	 * 修改线索数据后的同步的数据ID
	 */
	@ApiField("data_id")
	private String dataId;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

}
