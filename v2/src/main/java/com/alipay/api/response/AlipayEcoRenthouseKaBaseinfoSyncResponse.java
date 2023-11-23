package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.ka.baseinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:35:33
 */
public class AlipayEcoRenthouseKaBaseinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5729711735536656439L;

	/** 
	 * 返回kaCode唯一标识,用户查询ka信息时候用
	 */
	@ApiField("ka_code")
	private String kaCode;

	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}
	public String getKaCode( ) {
		return this.kaCode;
	}

}
