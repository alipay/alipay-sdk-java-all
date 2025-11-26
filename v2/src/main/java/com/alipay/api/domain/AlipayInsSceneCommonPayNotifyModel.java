package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知支付接口
 *
 * @author auto create
 * @since 1.0, 2024-05-15 14:25:43
 */
public class AlipayInsSceneCommonPayNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3395453794918988987L;

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
	 * 预下单id
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

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

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

}
