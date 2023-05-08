package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品投放信息
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:59:02
 */
public class ItemDeliveryInfoSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 6534499939136438229L;

	/**
	 * 标识商品投放的场景，ALIPAY：公域，MERCHANT：私域
	 */
	@ApiField("camp_type")
	private String campType;

	/**
	 * 标识商品投放的展位
	 */
	@ApiField("position_id")
	private String positionId;

	public String getCampType() {
		return this.campType;
	}
	public void setCampType(String campType) {
		this.campType = campType;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

}
