package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserFacePaySkinInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.facepayskin.receive response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-14 15:25:35
 */
public class AlipayCommerceSportsFacepayskinReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5553623747838948736L;

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
