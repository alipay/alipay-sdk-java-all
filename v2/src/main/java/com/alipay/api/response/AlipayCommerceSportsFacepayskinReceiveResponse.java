package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserFacePaySkinInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.facepayskin.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:36:46
 */
public class AlipayCommerceSportsFacepayskinReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4795418448484463579L;

	/** 
	 * 用户付款码皮肤信息
	 */
	@ApiField("data")
	private UserFacePaySkinInfo data;

	public void setData(UserFacePaySkinInfo data) {
		this.data = data;
	}
	public UserFacePaySkinInfo getData( ) {
		return this.data;
	}

}
