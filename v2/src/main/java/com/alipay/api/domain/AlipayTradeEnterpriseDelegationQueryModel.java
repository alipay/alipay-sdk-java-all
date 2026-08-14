package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业委托代理支付结果查询
 *
 * @author auto create
 * @since 1.0, 2026-07-24 22:07:49
 */
public class AlipayTradeEnterpriseDelegationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6261464655937477944L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

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

	public String getPrepayId() {
		return this.prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

}
