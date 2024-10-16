package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 17:07:12
 */
public class AlipayMarketingQualificationDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4638848548133314515L;

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
