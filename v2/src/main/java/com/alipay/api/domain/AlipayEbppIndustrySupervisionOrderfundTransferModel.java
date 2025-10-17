package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管冻资订单资金划付
 *
 * @author auto create
 * @since 1.0, 2025-10-14 19:14:02
 */
public class AlipayEbppIndustrySupervisionOrderfundTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3321621213529653464L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 操作金额（整数，单位：分）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单归属的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 交易币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 本次请求流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 需要进行冻资划拨的关联订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 收款方主体信息，字符串BASE64加密
	 */
	@ApiField("payee_participant_info")
	private String payeeParticipantInfo;

	/**
	 * 操作场景类型
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutFlowId() {
		return this.outFlowId;
	}
	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayeeParticipantInfo() {
		return this.payeeParticipantInfo;
	}
	public void setPayeeParticipantInfo(String payeeParticipantInfo) {
		this.payeeParticipantInfo = payeeParticipantInfo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
