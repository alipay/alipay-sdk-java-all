package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能量查询返回结果
 *
 * @author auto create
 * @since 1.0, 2022-06-09 14:49:27
 */
public class EnergyQueryRsp extends AlipayObject {

	private static final long serialVersionUID = 3538882897763921478L;

	/**
	 * 失败描述信息
	 */
	@ApiField("failed_msg")
	private String failedMsg;

	/**
	 * 能量数量，单位g
	 */
	@ApiField("full_energy")
	private String fullEnergy;

	/**
	 * 物品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * item列表
	 */
	@ApiField("items")
	private EnergyExtRequest items;

	/**
	 * 结果
	 */
	@ApiField("result")
	private Boolean result;

	public String getFailedMsg() {
		return this.failedMsg;
	}
	public void setFailedMsg(String failedMsg) {
		this.failedMsg = failedMsg;
	}

	public String getFullEnergy() {
		return this.fullEnergy;
	}
	public void setFullEnergy(String fullEnergy) {
		this.fullEnergy = fullEnergy;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public EnergyExtRequest getItems() {
		return this.items;
	}
	public void setItems(EnergyExtRequest items) {
		this.items = items;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}
