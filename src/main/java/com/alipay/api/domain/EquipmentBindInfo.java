package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具绑定信息，包括机具ID和是否绑定门店
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:28:49
 */
public class EquipmentBindInfo extends AlipayObject {

	private static final long serialVersionUID = 6468866939782664159L;

	/**
	 * 机具ID
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 是否绑定门店，T绑定，F不绑定
	 */
	@ApiField("is_bind_shop")
	private String isBindShop;

	public String getEquipmentId() {
		return this.equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getIsBindShop() {
		return this.isBindShop;
	}
	public void setIsBindShop(String isBindShop) {
		this.isBindShop = isBindShop;
	}

}
