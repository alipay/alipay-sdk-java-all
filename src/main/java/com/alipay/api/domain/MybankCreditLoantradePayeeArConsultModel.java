package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收方签约咨询
 *
 * @author auto create
 * @since 1.0, 2022-01-13 15:03:10
 */
public class MybankCreditLoantradePayeeArConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4499352225834868342L;

	/**
	 * 签约业务场景，网商指定
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约业务子场景，网商指定，可选
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

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

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public CreditPayUserVO getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(CreditPayUserVO userInfo) {
		this.userInfo = userInfo;
	}

}
