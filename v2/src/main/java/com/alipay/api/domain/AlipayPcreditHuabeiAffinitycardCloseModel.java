package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户申请关闭用户花呗联名卡
 *
 * @author auto create
 * @since 1.0, 2026-07-02 11:27:56
 */
public class AlipayPcreditHuabeiAffinitycardCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8273625196794856647L;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务单号，用于幂等，不超过32位
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户花呗联名卡产品账户号
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserProdAccountNo() {
		return this.userProdAccountNo;
	}
	public void setUserProdAccountNo(String userProdAccountNo) {
		this.userProdAccountNo = userProdAccountNo;
	}

}
