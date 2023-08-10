package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefererSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.referer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:06:54
 */
public class AlipayCloudCloudrunStaticsiteRefererModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6595411584361194214L;

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
