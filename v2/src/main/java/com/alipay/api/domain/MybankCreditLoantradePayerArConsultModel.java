package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付方签约状态查询
 *
 * @author auto create
 * @since 1.0, 2023-04-11 17:37:16
 */
public class MybankCreditLoantradePayerArConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5369754724161686829L;

	/**
	 * 签约业务场景，网商指定
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户信息
	 */
	@ApiField("user_info")
	private CreditPayUserVO userInfo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public CreditPayUserVO getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(CreditPayUserVO userInfo) {
		this.userInfo = userInfo;
	}

}
