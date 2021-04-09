package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自提业务信息
 *
 * @author auto create
 * @since 1.0, 2021-04-08 19:40:16
 */
public class PickUpInfo extends AlipayObject {

	private static final long serialVersionUID = 2578494363716649683L;

	/**
	 * 自提地址（展示的地址）
	 */
	@ApiField("pick_up_address")
	private String pickUpAddress;

	/**
	 * 类型对应取餐码
	 */
	@ApiField("pick_up_code")
	private String pickUpCode;

	/**
	 * 自提门店名称
	 */
	@ApiField("pick_up_shop_name")
	private String pickUpShopName;

	/**
	 * 取餐凭证类型，待自取及之后状态必填
	 */
	@ApiField("pick_up_type")
	private String pickUpType;

	public String getPickUpAddress() {
		return this.pickUpAddress;
	}
	public void setPickUpAddress(String pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}

	public String getPickUpCode() {
		return this.pickUpCode;
	}
	public void setPickUpCode(String pickUpCode) {
		this.pickUpCode = pickUpCode;
	}

	public String getPickUpShopName() {
		return this.pickUpShopName;
	}
	public void setPickUpShopName(String pickUpShopName) {
		this.pickUpShopName = pickUpShopName;
	}

	public String getPickUpType() {
		return this.pickUpType;
	}
	public void setPickUpType(String pickUpType) {
		this.pickUpType = pickUpType;
	}

}
