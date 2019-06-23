package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询口碑子账户信息列表
 *
 * @author auto create
 * @since 1.0, 2018-11-19 18:09:45
 */
public class KoubeiMerchantKbcloudSubuserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3835859658192656346L;

	/**
	 * 主账号ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
