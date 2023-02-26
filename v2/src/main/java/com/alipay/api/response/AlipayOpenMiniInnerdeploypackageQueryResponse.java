package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenAppDeployPackageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerdeploypackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:53:56
 */
public class AlipayOpenMiniInnerdeploypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8881938372299416889L;

	/** 
	 * 小程序部署包模型
	 */
	@ApiField("app_deploy_package")
	private OpenAppDeployPackageVO appDeployPackage;

	public void setAppDeployPackage(OpenAppDeployPackageVO appDeployPackage) {
		this.appDeployPackage = appDeployPackage;
	}
	public OpenAppDeployPackageVO getAppDeployPackage( ) {
		return this.appDeployPackage;
	}

}
