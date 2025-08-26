package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询有效子凭证详细信息
 *
 * @author auto create
 * @since 1.0, 2023-02-07 16:11:15
 */
public class AlipayMarketingCampaignSubcertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7723615856528824237L;

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
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
