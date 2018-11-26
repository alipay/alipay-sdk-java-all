package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSuccessRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.send response.
 * 
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:49
 */
public class AlipayMarketingToolFengdieTemplateSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8683645838738176897L;

	/** 
	 * 分配模板的操作是否成功
	 */
	@ApiField("data")
	private FengdieSuccessRespModel data;

	public void setData(FengdieSuccessRespModel data) {
		this.data = data;
	}
	public FengdieSuccessRespModel getData( ) {
		return this.data;
	}

}
