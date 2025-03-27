package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁行业风险咨询
 *
 * @author auto create
 * @since 1.0, 2025-03-21 16:32:25
 */
public class AlipayCommerceRentRiskConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7153956686939135985L;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * null
	 */
	@ApiListField("consult_risk_types")
	@ApiField("string")
	private List<String> consultRiskTypes;

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

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public List<String> getConsultRiskTypes() {
		return this.consultRiskTypes;
	}
	public void setConsultRiskTypes(List<String> consultRiskTypes) {
		this.consultRiskTypes = consultRiskTypes;
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
