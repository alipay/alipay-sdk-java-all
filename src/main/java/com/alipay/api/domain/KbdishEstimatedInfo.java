package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品估清模型
 *
 * @author auto create
 * @since 1.0, 2019-01-07 17:45:44
 */
public class KbdishEstimatedInfo extends AlipayObject {

	private static final long serialVersionUID = 5427486459279911149L;

	/**
	 * 估清的菜品dishid或者materialId,该值对应的类型由dsType指定。
	 */
	@ApiField("ds_id")
	private String dsId;

	/**
	 * dishid:菜品维度估清
materialid:加料维度沽清
	 */
	@ApiField("ds_type")
	private String dsType;

	/**
	 * 估清后临时库存.大于等于0的数字。
status=open必须要传一个数。
在沽清类型为加料的时候，该项强制为0。
	 */
	@ApiField("inventory")
	private String inventory;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态。open:估清;stop:取消估清
	 */
	@ApiField("status")
	private String status;

	/**
	 * 估清最后修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getDsId() {
		return this.dsId;
	}
	public void setDsId(String dsId) {
		this.dsId = dsId;
	}

	public String getDsType() {
		return this.dsType;
	}
	public void setDsType(String dsType) {
		this.dsType = dsType;
	}

	public String getInventory() {
		return this.inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
