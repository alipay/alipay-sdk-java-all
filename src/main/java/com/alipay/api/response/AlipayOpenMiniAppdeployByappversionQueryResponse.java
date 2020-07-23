package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppDeployResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appdeploy.byappversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-09 16:32:51
 */
public class AlipayOpenMiniAppdeployByappversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6229719333135326513L;

	/** 
	 * 发布信息
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
