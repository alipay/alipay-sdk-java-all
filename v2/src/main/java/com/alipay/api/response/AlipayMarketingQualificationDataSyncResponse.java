package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-14 15:14:47
 */
public class AlipayMarketingQualificationDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4541352577553243119L;

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
