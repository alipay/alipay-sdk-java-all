package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关闭预下单
 *
 * @author auto create
 * @since 1.0, 2022-09-29 15:42:28
 */
public class AlipayInsSceneEcommercePreorderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7818928312792659169L;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 指定预下单列表，选填
	 */
	@ApiListField("pre_order_ids")
	@ApiField("string")
	private List<String> preOrderIds;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public List<String> getPreOrderIds() {
		return this.preOrderIds;
	}
	public void setPreOrderIds(List<String> preOrderIds) {
		this.preOrderIds = preOrderIds;
	}

}
