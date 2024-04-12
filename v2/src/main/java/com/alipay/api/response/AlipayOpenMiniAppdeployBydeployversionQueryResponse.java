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
 * @since 1.0, 2023-09-11 17:57:21
 */
public class AlipayOpenMiniAppdeployBydeployversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3199925953832132459L;

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
