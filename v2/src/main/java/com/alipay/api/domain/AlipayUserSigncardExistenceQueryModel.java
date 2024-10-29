package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断userId对应支付宝账号是否绑卡
 *
 * @author auto create
 * @since 1.0, 2019-01-24 15:03:42
 */
public class AlipayUserSigncardExistenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3465695527921446238L;

	/**
	 * 蚂蚁统一会员ID
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
