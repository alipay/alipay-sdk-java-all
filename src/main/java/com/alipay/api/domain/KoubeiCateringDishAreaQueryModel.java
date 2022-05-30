package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐区餐台查询api
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:39:53
 */
public class KoubeiCateringDishAreaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7372382753976836261L;

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
	 * 商户id
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
	 * 餐台id  根据餐台反查到餐区，再返回全模型
	 */
	@ApiField("tab_id")
	private String tabId;

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

	public String getTabId() {
		return this.tabId;
	}
	public void setTabId(String tabId) {
		this.tabId = tabId;
	}

}
