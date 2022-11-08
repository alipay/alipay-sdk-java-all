package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝端内绑定支付宝token换取支付宝账号信息
 *
 * @author auto create
 * @since 1.0, 2022-05-19 11:13:26
 */
public class AlipayUserAccountInfoTaobaoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1833954147516326715L;

	/**
	 * target+否+手淘端内绑定支付宝账号+taobaoBindAlipay+固定值+仅支持手淘绑定支付宝链路使用
	 */
	@ApiField("target")
	private String target;

	/**
	 * token+唯一+手淘端内绑定支付宝账号+无+手淘绑定支付宝链路登录支付宝成功下发+仅支持手淘绑定支付宝链路使用
	 */
	@ApiField("user_token")
	private String userToken;

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
