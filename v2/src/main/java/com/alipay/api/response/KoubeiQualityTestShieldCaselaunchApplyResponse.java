package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.shield.caselaunch.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:47:06
 */
public class KoubeiQualityTestShieldCaselaunchApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7861961455261414812L;

	/** 
	 * 拓展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

}
