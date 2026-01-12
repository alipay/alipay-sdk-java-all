package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡退卡接口
 *
 * @author auto create
 * @since 1.0, 2025-12-30 16:12:43
 */
public class AlipayCommerceGasMcardReturnModel extends AlipayObject {

	private static final long serialVersionUID = 6319277654115446512L;

	/**
	 * 小程序id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构侧会员卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
