package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schooldevice.sm.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 10:57:36
 */
public class AlipayCommerceEducateSchooldeviceSmCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1741587774925239949L;

	/** 
	 * 间联商户名称
	 */
	@ApiField("sm_cn_name")
	private String smCnName;

	/** 
	 * 间联商户经营类目名称
	 */
	@ApiField("sm_mcc_name")
	private String smMccName;

	/** 
	 * 间联商户新经营类目名称
	 */
	@ApiField("sm_new_mcc_ame")
	private String smNewMccAme;

	public void setSmCnName(String smCnName) {
		this.smCnName = smCnName;
	}
	public String getSmCnName( ) {
		return this.smCnName;
	}

	public void setSmMccName(String smMccName) {
		this.smMccName = smMccName;
	}
	public String getSmMccName( ) {
		return this.smMccName;
	}

	public void setSmNewMccAme(String smNewMccAme) {
		this.smNewMccAme = smNewMccAme;
	}
	public String getSmNewMccAme( ) {
		return this.smNewMccAme;
	}

}
