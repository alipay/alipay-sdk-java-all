package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserIdentificationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.dcguard.cardofuserinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:47:50
 */
public class AlipayDigitalmgmtDcguardCardofuserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2622248433849568623L;

	/** 
	 * 工卡查询人员结果
	 */
	@ApiField("result")
	private UserIdentificationDTO result;

	public void setResult(UserIdentificationDTO result) {
		this.result = result;
	}
	public UserIdentificationDTO getResult( ) {
		return this.result;
	}

}
