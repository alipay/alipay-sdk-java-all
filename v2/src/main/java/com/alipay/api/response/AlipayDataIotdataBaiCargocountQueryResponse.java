package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.bai.cargocount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:39:45
 */
public class AlipayDataIotdataBaiCargocountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5649447458584215743L;

	/** 
	 * JSON字符串，包含盘点结果详情，如检测到每个货物的中心点坐标
	 */
	@ApiField("storage_detail")
	private String storageDetail;

	/** 
	 * 算法盘点出的货物数量
	 */
	@ApiField("storage_num")
	private Long storageNum;

	public void setStorageDetail(String storageDetail) {
		this.storageDetail = storageDetail;
	}
	public String getStorageDetail( ) {
		return this.storageDetail;
	}

	public void setStorageNum(Long storageNum) {
		this.storageNum = storageNum;
	}
	public Long getStorageNum( ) {
		return this.storageNum;
	}

}
