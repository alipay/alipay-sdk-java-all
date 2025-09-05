package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品估清模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:12
 */
public class KbdishEstimatedInfo extends AlipayObject {

	private static final long serialVersionUID = 7745757243539273524L;

	/**
	 * 估清的菜品dishid，加料materialId，或者外部菜品id，该值对应的类型由dsType指定。
	 */
	@ApiField("ds_id")
	private String dsId;

	/**
	 * dishid:菜品维度估清
materialid:加料维度沽清
outdishid:外部菜品id估清，使用外部菜品id需要特殊权限，请联系技术支持
	 */
	@ApiField("ds_type")
	private String dsType;

	/**
	 * 估清后临时库存.大于等于0的数字。
在沽清类型为加料的时候，该项强制为0。
	 */
	@ApiField("inventory")
	private String inventory;

	/**
	 * 外部门店id，与shop_id不能同时为空
使用外部门店id需要特殊申请，请联系技术支持
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店ID，使用out_shop_id时可以为空
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

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
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
