package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.user.feature.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-28 11:26:52
 */
public class AlipayCommerceOperationUserFeatureConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4531268436936869939L;

	/** 
	 * biz_scene
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 咨询结果
	 */
	@ApiField("result")
	private String result;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
