package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑餐区模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:19
 */
public class KbdishAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 3182814563297791161L;

	/**
	 * 餐区开台菜列表
	 */
	@ApiListField("area_free_list")
	@ApiField("kbdish_area_free_info")
	private List<KbdishAreaFreeInfo> areaFreeList;

	/**
	 * 餐区id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 餐区名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 餐区排序序号
	 */
	@ApiField("area_sort")
	private String areaSort;

	/**
	 * 创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 餐区服务费
	 */
	@ApiField("fee_price")
	private String feePrice;

	/**
	 * 商家id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 门店id 支付宝的
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 餐区的餐桌数量
	 */
	@ApiField("tab_count")
	private String tabCount;

	/**
	 * 餐区下的餐台列表
	 */
	@ApiListField("tab_list")
	@ApiField("kbdish_tab_info")
	private List<KbdishTabInfo> tabList;

	/**
	 * 修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	public List<KbdishAreaFreeInfo> getAreaFreeList() {
		return this.areaFreeList;
	}
	public void setAreaFreeList(List<KbdishAreaFreeInfo> areaFreeList) {
		this.areaFreeList = areaFreeList;
	}

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaSort() {
		return this.areaSort;
	}
	public void setAreaSort(String areaSort) {
		this.areaSort = areaSort;
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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

	public String getTabCount() {
		return this.tabCount;
	}
	public void setTabCount(String tabCount) {
		this.tabCount = tabCount;
	}

	public List<KbdishTabInfo> getTabList() {
		return this.tabList;
	}
	public void setTabList(List<KbdishTabInfo> tabList) {
		this.tabList = tabList;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
