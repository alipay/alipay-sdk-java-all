package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算主体模型
 *
 * @author auto create
 * @since 1.0, 2023-12-22 11:07:12
 */
public class SettleEntity extends AlipayObject {

	private static final long serialVersionUID = 7543324171312286715L;

	/**
	 * 结算主体资产业务类型，settled 表示已结算资产
	 */
	@ApiField("settle_entity_biz_type")
	private String settleEntityBizType;

	/**
	 * 结算主体账号
当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID；当结算主体类型为MerchantStore，本参数为商户门店ID。
	 */
	@ApiField("settle_entity_id")
	private String settleEntityId;

	/**
	 * 结算主体类型
SecondMerchant：结算主体为二级商户；Store：结算主体为商户门店
	 */
	@ApiField("settle_entity_type")
	private String settleEntityType;

	public String getSettleEntityBizType() {
		return this.settleEntityBizType;
	}
	public void setSettleEntityBizType(String settleEntityBizType) {
		this.settleEntityBizType = settleEntityBizType;
	}

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
