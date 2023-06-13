package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.contract.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-09 18:03:34
 */
public class AlipayInsSceneInsserviceprodContractCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 1244335519489591243L;

	/** 
	 * INIT：未生效
FINISHED：服务已完结，无法提供服务
EFFECTIVE：生效中，可以提供服务
RELEASED：服务已解约，无法提供服务
CLOSED：已关闭
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
