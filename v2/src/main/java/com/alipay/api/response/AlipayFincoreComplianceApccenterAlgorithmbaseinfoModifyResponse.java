package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.apccenter.algorithmbaseinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-16 00:05:00
 */
public class AlipayFincoreComplianceApccenterAlgorithmbaseinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5486842132934472839L;

	/** 
	 * 平台算法唯一编码
	 */
	@ApiField("platform_algorithm_code")
	private String platformAlgorithmCode;

	/** 
	 * 平台算法来源
	 */
	@ApiField("platform_algorithm_source")
	private String platformAlgorithmSource;

	public void setPlatformAlgorithmCode(String platformAlgorithmCode) {
		this.platformAlgorithmCode = platformAlgorithmCode;
	}
	public String getPlatformAlgorithmCode( ) {
		return this.platformAlgorithmCode;
	}

	public void setPlatformAlgorithmSource(String platformAlgorithmSource) {
		this.platformAlgorithmSource = platformAlgorithmSource;
	}
	public String getPlatformAlgorithmSource( ) {
		return this.platformAlgorithmSource;
	}

}
