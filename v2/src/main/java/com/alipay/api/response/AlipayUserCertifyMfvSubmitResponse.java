package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.mfv.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:07:56
 */
public class AlipayUserCertifyMfvSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4338762671453857571L;

	/** 
	 * extend_map是核验的扩展数据，根据不同的scene_id，返回的数据不同。
	 */
	@ApiField("ext_info")
	private String extInfo;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

}
