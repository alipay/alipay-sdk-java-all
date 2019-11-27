package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 拼团用户信息列表
 *
 * @author auto create
 * @since 1.0, 2018-11-26 21:08:07
 */
public class PintuanUserInfos extends AlipayObject {

	private static final long serialVersionUID = 1696589494946476569L;

	/**
	 * 拼团用户信息列表
	 */
	@ApiListField("pintuan_user_info_list")
	@ApiField("pintuan_user_info")
	private List<PintuanUserInfo> pintuanUserInfoList;

	public List<PintuanUserInfo> getPintuanUserInfoList() {
		return this.pintuanUserInfoList;
	}
	public void setPintuanUserInfoList(List<PintuanUserInfo> pintuanUserInfoList) {
		this.pintuanUserInfoList = pintuanUserInfoList;
	}

}
