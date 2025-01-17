package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商保码-用户三要素查询
 *
 * @author auto create
 * @since 1.0, 2024-11-21 21:25:07
 */
public class AlipayCommerceMedicalInsuranceUserfactorsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5833831912912334791L;

	/**
	 * 用户TOKEN值，保单、权限等查询等页面跳转之后前端会带过去和用户信息关联的user_token字段，用于外部查询用户三要素。
	 */
	@ApiField("user_token")
	private String userToken;

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
