package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.ka.baseinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:26:20
 */
public class AlipayEcoRenthouseKaBaseinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4224575756115647535L;

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
