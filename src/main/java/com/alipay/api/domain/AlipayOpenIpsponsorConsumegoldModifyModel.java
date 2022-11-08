package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付后扣、增消费金
 *
 * @author auto create
 * @since 1.0, 2022-08-15 11:17:46
 */
public class AlipayOpenIpsponsorConsumegoldModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3286256272223975861L;

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
