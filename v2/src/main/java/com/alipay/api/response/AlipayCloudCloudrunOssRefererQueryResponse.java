package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefererSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.oss.referer.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-03 12:17:03
 */
public class AlipayCloudCloudrunOssRefererQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7273312114161479769L;

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
