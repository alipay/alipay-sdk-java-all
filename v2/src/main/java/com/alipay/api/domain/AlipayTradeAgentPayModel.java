package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体支付接口
 *
 * @author auto create
 * @since 1.0, 2025-07-25 10:35:20
 */
public class AlipayTradeAgentPayModel extends AlipayObject {

	private static final long serialVersionUID = 2585991354722712185L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 预下单ID，通过请求alipay.trade.order.prepay接口获取预下单ID
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
