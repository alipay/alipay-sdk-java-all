package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.materiallibrary.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 15:32:26
 */
public class AlipayDataDataserviceAdMateriallibraryDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793864569367116465L;

	/** 
	 * 成功删除的个数
	 */
	@ApiField("result")
	private Long result;

	public void setResult(Long result) {
		this.result = result;
	}
	public Long getResult( ) {
		return this.result;
	}

}
