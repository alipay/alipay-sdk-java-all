package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业委托代理支付结果查询
 *
 * @author auto create
 * @since 1.0, 2026-09-28 23:32:53
 */
public class AlipayTradeEnterpriseDelegationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1751641542826465284L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 新模式商户外部订单号
	 */
	@ApiField("external_order_no")
	private String externalOrderNo;

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

	public String getExternalOrderNo() {
		return this.externalOrderNo;
	}
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}

	public String getPrepayId() {
		return this.prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

}
