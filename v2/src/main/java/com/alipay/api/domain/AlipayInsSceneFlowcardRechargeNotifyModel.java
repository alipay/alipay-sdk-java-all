package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量卡流量充值状态通知
 *
 * @author auto create
 * @since 1.0, 2026-02-25 14:44:39
 */
public class AlipayInsSceneFlowcardRechargeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1817198981632756459L;

	/**
	 * 充值业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 流量卡iccid
	 */
	@ApiField("iccid")
	private String iccid;

	/**
	 * 充值详情
	 */
	@ApiField("recharge_detail")
	private CardRechargeDetail rechargeDetail;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getIccid() {
		return this.iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public CardRechargeDetail getRechargeDetail() {
		return this.rechargeDetail;
	}
	public void setRechargeDetail(CardRechargeDetail rechargeDetail) {
		this.rechargeDetail = rechargeDetail;
	}

}
