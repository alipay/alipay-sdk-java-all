package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ParamModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.param.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:34:14
 */
public class KoubeiCateringPosParamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4129812693939998995L;

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
