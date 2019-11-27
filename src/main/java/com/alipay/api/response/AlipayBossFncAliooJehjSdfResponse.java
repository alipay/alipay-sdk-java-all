package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.alioo.jehj.sdf response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayBossFncAliooJehjSdfResponse extends AlipayResponse {

	private static final long serialVersionUID = 3335823423354672523L;

	/** 
	 * asfsd
	 */
	@ApiField("sdfsadf")
	private String sdfsadf;

	public void setSdfsadf(String sdfsadf) {
		this.sdfsadf = sdfsadf;
	}
	public String getSdfsadf( ) {
		return this.sdfsadf;
	}

}
