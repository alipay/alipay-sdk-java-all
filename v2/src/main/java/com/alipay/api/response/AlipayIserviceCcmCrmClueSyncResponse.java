package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.clue.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-22 20:57:40
 */
public class AlipayIserviceCcmCrmClueSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7651913394557662387L;

	/** 
	 * 同步线索业务数据后的返回数据ID
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
