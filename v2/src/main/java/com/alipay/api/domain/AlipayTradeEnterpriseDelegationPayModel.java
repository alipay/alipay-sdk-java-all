package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业委托代理支付
 *
 * @author auto create
 * @since 1.0, 2026-05-22 13:57:49
 */
public class AlipayTradeEnterpriseDelegationPayModel extends AlipayObject {

	private static final long serialVersionUID = 8673431646359737688L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 指定支付渠道,单通道扣款,扣款失败则交易失败,不轮扣用户其他资产
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 预下单ID，如果是预下单场景传预下单ID,如果是创单场景可以直接传递交易号
	 */
	@ApiField("prepay_id")
	private String prepayId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnablePayChannels() {
		return this.enablePayChannels;
	}
	public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
	}

	public String getPrepayId() {
		return this.prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

}
