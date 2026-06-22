package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付主动还款
 *
 * @author auto create
 * @since 1.0, 2026-04-17 16:27:46
 */
public class AlipayTradeCreditOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 2515968336472587718L;

	/**
	 * 场景参数，标识还款场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

}
