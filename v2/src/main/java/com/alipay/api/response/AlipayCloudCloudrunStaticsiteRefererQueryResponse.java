package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefererSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.referer.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-02 19:01:53
 */
public class AlipayCloudCloudrunStaticsiteRefererQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5564289292545889678L;

	/** 
	 * referer配置
	 */
	@ApiField("referer")
	private RefererSetting referer;

	public void setReferer(RefererSetting referer) {
		this.referer = referer;
	}
	public RefererSetting getReferer( ) {
		return this.referer;
	}

}
