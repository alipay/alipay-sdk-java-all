package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 21:30:21
 */
public class AlipayMarketingQualificationDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5814162948583468747L;

	/** 
	 * 操作流水id
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
