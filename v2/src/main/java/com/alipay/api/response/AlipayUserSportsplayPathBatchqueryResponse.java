package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WalkPathMetaDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportsplay.path.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-27 14:16:48
 */
public class AlipayUserSportsplayPathBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3611165691727245824L;

	/** 
	 * 路线列表
	 */
	@ApiField("response")
	private WalkPathMetaDataResult response;

	public void setResponse(WalkPathMetaDataResult response) {
		this.response = response;
	}
	public WalkPathMetaDataResult getResponse( ) {
		return this.response;
	}

}
