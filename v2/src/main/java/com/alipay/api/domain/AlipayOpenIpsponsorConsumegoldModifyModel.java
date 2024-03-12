package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付后扣、增消费金
 *
 * @author auto create
 * @since 1.0, 2023-03-09 19:13:16
 */
public class AlipayOpenIpsponsorConsumegoldModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3421873944852255324L;

	/**
	 * 蚂蚁统一会员OPEN ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于标识具体扣、增消费金的值
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
