package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.beneficialinfo.certify response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-27 20:10:11
 */
public class AlipayOverseasRemitBeneficialinfoCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4182477827425587178L;

	/** 
	 * 是否有默认收款卡号
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 验证是否通过
	 */
	@ApiField("is_pass")
	private Boolean isPass;

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setIsPass(Boolean isPass) {
		this.isPass = isPass;
	}
	public Boolean getIsPass( ) {
		return this.isPass;
	}

}
