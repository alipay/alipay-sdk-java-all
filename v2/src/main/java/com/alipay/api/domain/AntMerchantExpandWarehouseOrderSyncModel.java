package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓库转单接口
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:19:39
 */
public class AntMerchantExpandWarehouseOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4746635772185942617L;

	/**
	 * 配送指令ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 仓库id
	 */
	@ApiField("new_warehouse_id")
	private String newWarehouseId;

	/**
	 * 指令类型
	 */
	@ApiField("type")
	private String type;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getNewWarehouseId() {
		return this.newWarehouseId;
	}
	public void setNewWarehouseId(String newWarehouseId) {
		this.newWarehouseId = newWarehouseId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
