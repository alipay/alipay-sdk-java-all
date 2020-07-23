package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改查询口碑零售供应商和商户的仓库信息
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:53:53
 */
public class KoubeiRetailWmsWarehouseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4628378441894144415L;

	/**
	 * 扩展信息
ADMIN_PHONE:管理员电话
CITY_MANAGER_PHONE:城市经理电话
PURCHASE_MANAGER_PHONE:采购经理电话
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否开启安全库存开关 ON打开 OFF关闭
	 */
	@ApiField("safety_inventory_switch")
	private String safetyInventorySwitch;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSafetyInventorySwitch() {
		return this.safetyInventorySwitch;
	}
	public void setSafetyInventorySwitch(String safetyInventorySwitch) {
		this.safetyInventorySwitch = safetyInventorySwitch;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
