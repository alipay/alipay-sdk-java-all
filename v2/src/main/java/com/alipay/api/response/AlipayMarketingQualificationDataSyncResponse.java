package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-30 16:47:11
 */
public class AlipayMarketingQualificationDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3623663295413792932L;

	/** 
	 * 本次操作的流水id
	 */
	@ApiField("operate_id")
	private String operateId;

	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}
	public String getOperateId( ) {
		return this.operateId;
	}

}
