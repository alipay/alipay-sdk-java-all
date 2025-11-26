package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改划拨单金额
 *
 * @author auto create
 * @since 1.0, 2025-11-24 10:57:41
 */
public class AlipayEbppIndustrySupervisionOrderfundtransferModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7171877913777838775L;

	/**
	 * 用户支付宝uid
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
	 * 默认CNY 目前只支持CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 修改的划拨单请求流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 关联订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

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

}
