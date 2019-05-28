package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算主体模型
 *
 * @author auto create
 * @since 1.0, 2019-05-05 14:51:57
 */
public class SettleEntity extends AlipayObject {

	private static final long serialVersionUID = 5851216326262712864L;

	/**
	 * 结算主体账号
当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID；当结算主体类型为MerchantStore，本参数为商户门店ID。
	 */
	@ApiField("settle_entity_id")
	private String settleEntityId;

	/**
	 * 结算主体类型
SecondMerchant：结算主体为二级商户；MerchantStore：结算主体为商户门店
	 */
	@ApiField("settle_entity_type")
	private String settleEntityType;

	public String getSettleEntityId() {
		return this.settleEntityId;
	}
	public void setSettleEntityId(String settleEntityId) {
		this.settleEntityId = settleEntityId;
	}

	public String getSettleEntityType() {
		return this.settleEntityType;
	}
	public void setSettleEntityType(String settleEntityType) {
		this.settleEntityType = settleEntityType;
	}

}
