package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 能量清单明细
 *
 * @author auto create
 * @since 1.0, 2021-11-01 11:26:13
 */
public class EnergyGoodRequest extends AlipayObject {

	private static final long serialVersionUID = 2691168715657562476L;

	/**
	 * 发放的能量
	 */
	@ApiField("full_energy")
	private Long fullEnergy;

	/**
	 * item的类型
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 扩展信息
	 */
	@ApiListField("items")
	@ApiField("energy_ext_request")
	private List<EnergyExtRequest> items;

	/**
	 * item的数量
	 */
	@ApiField("quantity")
	private String quantity;

	public Long getFullEnergy() {
		return this.fullEnergy;
	}
	public void setFullEnergy(Long fullEnergy) {
		this.fullEnergy = fullEnergy;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<EnergyExtRequest> getItems() {
		return this.items;
	}
	public void setItems(List<EnergyExtRequest> items) {
		this.items = items;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
