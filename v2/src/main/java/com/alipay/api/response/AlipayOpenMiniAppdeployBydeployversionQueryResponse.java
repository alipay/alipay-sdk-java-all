package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppDeployResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appdeploy.bydeployversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:55:14
 */
public class AlipayOpenMiniAppdeployBydeployversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5317219867528291393L;

	/** 
	 * 小程序发布信息
	 */
	@ApiListField("deploys")
	@ApiField("mini_app_deploy_response")
	private List<MiniAppDeployResponse> deploys;

	public void setDeploys(List<MiniAppDeployResponse> deploys) {
		this.deploys = deploys;
	}
	public List<MiniAppDeployResponse> getDeploys( ) {
		return this.deploys;
	}

}
