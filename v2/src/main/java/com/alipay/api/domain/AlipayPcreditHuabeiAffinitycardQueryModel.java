package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户查询花呗场景额度
 *
 * @author auto create
 * @since 1.0, 2026-07-02 15:41:47
 */
public class AlipayPcreditHuabeiAffinitycardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5239471193498392954L;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务场景，hellobike_hb_card-哈罗花呗联名卡
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 申请联名卡时获取，如果传入，会查询指定花呗联名卡账户信息，否则，查询最新申请的花呗联名卡账户信息
	 */
	@ApiField("user_prod_account_no")
	private String userProdAccountNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserProdAccountNo() {
		return this.userProdAccountNo;
	}
	public void setUserProdAccountNo(String userProdAccountNo) {
		this.userProdAccountNo = userProdAccountNo;
	}

}
