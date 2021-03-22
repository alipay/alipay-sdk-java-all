package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拼团用户信息列表
 *
 * @author auto create
 * @since 1.0, 2018-11-22 16:51:57
 */
public class PintuanUserInfos extends AlipayObject {

	private static final long serialVersionUID = 7736816236969341373L;

	/**
	 * 拼团用户信息列表
	 */
	@ApiField("pintuan_user_info_list")
	private PintuanUserInfo pintuanUserInfoList;

	public PintuanUserInfo getPintuanUserInfoList() {
		return this.pintuanUserInfoList;
	}
	public void setPintuanUserInfoList(PintuanUserInfo pintuanUserInfoList) {
		this.pintuanUserInfoList = pintuanUserInfoList;
	}

}
