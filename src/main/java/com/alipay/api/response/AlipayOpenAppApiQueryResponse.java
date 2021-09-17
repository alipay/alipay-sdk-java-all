package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AuthApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.api.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-27 11:10:14
 */
public class AlipayOpenAppApiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8889863711411727522L;

	/** 
	 * 应用可申请的接口出参敏感字段列表
	 */
	@ApiListField("apis")
	@ApiField("auth_api_d_t_o")
	private List<AuthApiDTO> apis;

	public void setApis(List<AuthApiDTO> apis) {
		this.apis = apis;
	}
	public List<AuthApiDTO> getApis( ) {
		return this.apis;
	}

}
