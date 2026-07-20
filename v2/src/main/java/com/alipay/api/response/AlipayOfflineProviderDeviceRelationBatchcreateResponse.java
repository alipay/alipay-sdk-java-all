package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.device.relation.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-10 11:07:55
 */
public class AlipayOfflineProviderDeviceRelationBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7192399384612231684L;

	/** 
	 * 新增设备数量
	 */
	@ApiField("insert_count")
	private Long insertCount;

	/** 
	 * 更新设备数量
	 */
	@ApiField("update_count")
	private Long updateCount;

	public void setInsertCount(Long insertCount) {
		this.insertCount = insertCount;
	}
	public Long getInsertCount( ) {
		return this.insertCount;
	}

	public void setUpdateCount(Long updateCount) {
		this.updateCount = updateCount;
	}
	public Long getUpdateCount( ) {
		return this.updateCount;
	}

}
