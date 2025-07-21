package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.mfv.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:04:31
 */
public class AlipayUserCertifyMfvSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5741334286984237889L;

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
