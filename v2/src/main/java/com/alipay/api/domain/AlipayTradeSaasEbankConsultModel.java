package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网银支付付款机构可用性咨询
 *
 * @author auto create
 * @since 1.0, 2026-09-07 16:52:50
 */
public class AlipayTradeSaasEbankConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6522498825342982267L;

	/**
	 * 统一买家身份信息。已有Customer时传入buyer_id_type和buyer_id；未提供已有Customer时必须提供out_merchant_no。
	 */
	@ApiField("buyer_info")
	private SaasBuyerInfo buyerInfo;

	/**
	 * 咨询对应的订单金额，单位为元，必须大于0且最多保留两位小数。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public SaasBuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(SaasBuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
