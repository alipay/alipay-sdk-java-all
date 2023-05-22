package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PintuanUserInfos;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.portrait.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:36:13
 */
public class AlipayUserPortraitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1866416939178125759L;

	/** 
	 * 拼团信息列表
	 */
	@ApiListField("pintuan_user_infos")
	@ApiField("pintuan_user_infos")
	private List<PintuanUserInfos> pintuanUserInfos;

	public void setPintuanUserInfos(List<PintuanUserInfos> pintuanUserInfos) {
		this.pintuanUserInfos = pintuanUserInfos;
	}
	public List<PintuanUserInfos> getPintuanUserInfos( ) {
		return this.pintuanUserInfos;
	}

}
