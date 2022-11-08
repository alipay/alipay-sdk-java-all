package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台取消订购接口
 *
 * @author auto create
 * @since 1.0, 2022-08-29 20:35:21
 */
public class AlipayInsSceneEcommercePurchaseCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8153154831354119433L;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 订购合约id
	 */
	@ApiField("purchase_contract_id")
	private String purchaseContractId;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPurchaseContractId() {
		return this.purchaseContractId;
	}
	public void setPurchaseContractId(String purchaseContractId) {
		this.purchaseContractId = purchaseContractId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
