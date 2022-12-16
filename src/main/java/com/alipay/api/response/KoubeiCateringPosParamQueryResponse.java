package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ParamModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.param.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosParamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5311713191836267623L;

	/** 
	 * 门店参数model
	 */
	@ApiField("param_model")
	private ParamModel paramModel;

	public void setParamModel(ParamModel paramModel) {
		this.paramModel = paramModel;
	}
	public ParamModel getParamModel( ) {
		return this.paramModel;
	}

}
