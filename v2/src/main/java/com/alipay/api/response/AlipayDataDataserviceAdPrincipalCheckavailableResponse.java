package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:50:05
 */
public class AlipayDataDataserviceAdPrincipalCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 5632485881338677729L;

	/** 
	 * 返回灯火商家的ID
	 */
	@ApiField("principal_id")
	private String principalId;

	/** 
	 * 查询签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}
	public String getPrincipalId( ) {
		return this.principalId;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
