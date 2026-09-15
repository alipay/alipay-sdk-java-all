package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体支付接口
 *
 * @author auto create
 * @since 1.0, 2026-09-03 14:21:19
 */
public class AlipayTradeAgentPayModel extends AlipayObject {

	private static final long serialVersionUID = 1781329836522396678L;

	/**
	 * 联系对应BD进行KYA申请后下发的智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 支付并签约的签约参数
	 */
	@ApiField("agreement_sign_params")
	private AgentSignParams agreementSignParams;

	/**
	 * 收银台场景，在Agent支付标准版场景下固定填“appPay”
	 */
	@ApiField("cashier_scene")
	private String cashierScene;

	/**
	 * 预下单ID，通过请求alipay.trade.order.prepay接口获取预下单ID
	 */
	@ApiField("prepay_id")
	private String prepayId;

	/**
	 * 根据支付宝提供的秘钥信息，对手机号或者联登支付宝账号进行加密后的字符串；
	 */
	@ApiField("user_token")
	private String userToken;

	/**
	 * 如果加密的是手机号，传固定值 encrypt_phone；
如果加密的是联登账号，传固定值encrypt_uid；
	 */
	@ApiField("user_token_type")
	private String userTokenType;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public AgentSignParams getAgreementSignParams() {
		return this.agreementSignParams;
	}
	public void setAgreementSignParams(AgentSignParams agreementSignParams) {
		this.agreementSignParams = agreementSignParams;
	}

	public String getCashierScene() {
		return this.cashierScene;
	}
	public void setCashierScene(String cashierScene) {
		this.cashierScene = cashierScene;
	}

	public String getPrepayId() {
		return this.prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getUserTokenType() {
		return this.userTokenType;
	}
	public void setUserTokenType(String userTokenType) {
		this.userTokenType = userTokenType;
	}

}
