package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智安通风险咨询API
 *
 * @author auto create
 * @since 1.0, 2025-01-24 17:32:22
 */
public class AlipayCommerceRentRiskConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1328368245976476397L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商家系统订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 风险业务场景
	 */
	@ApiField("risk_biz_scene")
	private String riskBizScene;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRiskBizScene() {
		return this.riskBizScene;
	}
	public void setRiskBizScene(String riskBizScene) {
		this.riskBizScene = riskBizScene;
	}

}
