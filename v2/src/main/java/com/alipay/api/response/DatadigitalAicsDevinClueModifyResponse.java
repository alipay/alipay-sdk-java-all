package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.clue.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 10:49:27
 */
public class DatadigitalAicsDevinClueModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5727324954419646252L;

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
