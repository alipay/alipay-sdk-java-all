package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.dataset.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:44:02
 */
public class AlipayDataDataserviceAdDatasetSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5721936295392897321L;

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
