package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户查询花呗场景订单
 *
 * @author auto create
 * @since 1.0, 2025-07-11 16:54:40
 */
public class AlipayPcreditHuabeiAffinitycardOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4379192462784234164L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

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

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

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

}
