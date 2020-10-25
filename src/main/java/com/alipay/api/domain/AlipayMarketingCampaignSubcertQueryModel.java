package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询有效子凭证详细信息
 *
 * @author auto create
 * @since 1.0, 2020-08-25 16:46:03
 */
public class AlipayMarketingCampaignSubcertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3795796572459762956L;

	/**
	 * 用户登录账号名：邮箱或手机号。已知支付宝账号的活动触发调用中，user_id与login_id至少有一个非空，都非空时，以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 营销平台凭证批次号
	 */
	@ApiField("lot_num")
	private String lotNum;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。该参数用于已知支付宝账号的活动触发。user_id、login_id两个参数至少有一个非空。
	 */
	@ApiField("user_id")
	private String userId;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLotNum() {
		return this.lotNum;
	}
	public void setLotNum(String lotNum) {
		this.lotNum = lotNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
