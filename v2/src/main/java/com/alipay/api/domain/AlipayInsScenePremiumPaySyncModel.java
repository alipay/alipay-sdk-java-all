package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保费打款同步
 *
 * @author auto create
 * @since 1.0, 2024-03-20 11:21:59
 */
public class AlipayInsScenePremiumPaySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3865233979138393612L;

	/**
	 * 外部订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保费打款信息
	 */
	@ApiField("premium_payment")
	private PremiumPaymentDTO premiumPayment;

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public PremiumPaymentDTO getPremiumPayment() {
		return this.premiumPayment;
	}
	public void setPremiumPayment(PremiumPaymentDTO premiumPayment) {
		this.premiumPayment = premiumPayment;
	}

}
