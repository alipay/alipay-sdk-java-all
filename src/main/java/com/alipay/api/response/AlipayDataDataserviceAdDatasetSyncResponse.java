package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.dataset.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-08 11:44:17
 */
public class AlipayDataDataserviceAdDatasetSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6741522359866524383L;

	/** 
	 * 成功同步数据集外部标志
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
