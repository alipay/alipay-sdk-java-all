package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请第三方app与蚂蚁通行证免登token
 *
 * @author auto create
 * @since 1.0, 2020-07-02 19:50:32
 */
public class AlipayUserAntpaasTokenThirdTrustLoginModel extends AlipayObject {

	private static final long serialVersionUID = 2751571366646854276L;

	/**
	 * 登录的目标业务，目前已经分配的有autoins，代表车险业务
	 */
	@ApiField("login_target")
	private String loginTarget;

	public String getLoginTarget() {
		return this.loginTarget;
	}
	public void setLoginTarget(String loginTarget) {
		this.loginTarget = loginTarget;
	}

}
