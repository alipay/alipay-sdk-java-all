package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐台模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:19
 */
public class KbdishTabInfo extends AlipayObject {

	private static final long serialVersionUID = 6621754771115625284L;

	/**
	 * 餐台所属餐区的id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 餐台创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 餐台服务费
	 */
	@ApiField("fee_price")
	private String feePrice;

	/**
	 * 餐台座位人数
	 */
	@ApiField("seat_count")
	private String seatCount;

	/**
	 * 餐台id
	 */
	@ApiField("tab_id")
	private String tabId;

	/**
	 * 餐台名称
	 */
	@ApiField("tab_name")
	private String tabName;

	/**
	 * 餐台序号
	 */
	@ApiField("tab_sort")
	private String tabSort;

	/**
	 * 餐台状态 empty:空闲 hold:站位  clean:清扫
	 */
	@ApiField("tab_tstatus")
	private String tabTstatus;

	/**
	 * 餐区修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getFeePrice() {
		return this.feePrice;
	}
	public void setFeePrice(String feePrice) {
		this.feePrice = feePrice;
	}

	public String getSeatCount() {
		return this.seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String getTabId() {
		return this.tabId;
	}
	public void setTabId(String tabId) {
		this.tabId = tabId;
	}

	public String getTabName() {
		return this.tabName;
	}
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public String getTabSort() {
		return this.tabSort;
	}
	public void setTabSort(String tabSort) {
		this.tabSort = tabSort;
	}

	public String getTabTstatus() {
		return this.tabTstatus;
	}
	public void setTabTstatus(String tabTstatus) {
		this.tabTstatus = tabTstatus;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
