package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户已签约卡信息
 *
 * @author auto create
 * @since 1.0, 2023-01-12 16:52:55
 */
public class AlipayFinancialnetAuthExpressSigncardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8255435431961939517L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * open_id，唯一，在查签约卡的时候，上游传入，由平台转成finsign能够识别的2088账号。可以通过openId SDK的api进行获取。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
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
