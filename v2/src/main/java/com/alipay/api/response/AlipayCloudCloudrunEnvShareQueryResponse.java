package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AppEnvShare;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.env.share.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-23 10:31:58
 */
public class AlipayCloudCloudrunEnvShareQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8488962261588193777L;

	/** 
	 * 资源复用关联应用环境，已资源复用源app_id（公共请求参数中的app_id）资源环境关联列表中的单个应用环境。其中包括关联应用id、源应用id的环境id、源应用id的环境资源所属产品code等
	 */
	@ApiField("app_env_shares")
	private AppEnvShare appEnvShares;

	/** 
	 * 对返回结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setAppEnvShares(AppEnvShare appEnvShares) {
		this.appEnvShares = appEnvShares;
	}
	public AppEnvShare getAppEnvShares( ) {
		return this.appEnvShares;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
