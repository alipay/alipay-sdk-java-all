package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IcrowdUseResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.icrowd.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:38:48
 */
public class AlipayDataDataserviceIcrowdUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5756212928167613965L;

	/** 
	 * 接口返回内容
	 */
	@ApiField("icrowd_use_resp")
	private IcrowdUseResp icrowdUseResp;

	public void setIcrowdUseResp(IcrowdUseResp icrowdUseResp) {
		this.icrowdUseResp = icrowdUseResp;
	}
	public IcrowdUseResp getIcrowdUseResp( ) {
		return this.icrowdUseResp;
	}

}
