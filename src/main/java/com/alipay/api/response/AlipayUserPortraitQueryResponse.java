package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PintuanUserInfos;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.portrait.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserPortraitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4397357393377878669L;

	/** 
	 * 拼团信息列表
	 */
	@ApiField("pintuan_user_infos")
	private PintuanUserInfos pintuanUserInfos;

	public void setPintuanUserInfos(PintuanUserInfos pintuanUserInfos) {
		this.pintuanUserInfos = pintuanUserInfos;
	}
	public PintuanUserInfos getPintuanUserInfos( ) {
		return this.pintuanUserInfos;
	}

}
