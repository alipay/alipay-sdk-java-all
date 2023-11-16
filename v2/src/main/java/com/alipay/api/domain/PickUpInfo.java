package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自提业务信息
 *
 * @author auto create
 * @since 1.0, 2022-01-26 11:11:10
 */
public class PickUpInfo extends AlipayObject {

	private static final long serialVersionUID = 1561769467234218577L;

	/**
	 * 自提地址（展示的地址）
	 */
	@ApiField("pick_up_address")
	private String pickUpAddress;

	/**
	 * 类型对应取餐码，待自取及之后状态必填。建议生成该字段时即回传。
	 */
	@ApiField("pick_up_code")
	private String pickUpCode;

	/**
	 * 自提门店名称
	 */
	@ApiField("pick_up_shop_name")
	private String pickUpShopName;

	/**
	 * 取餐凭证类型。待自取及之后状态必填。整体状态生命周期中，必须回传1次。枚举支持：自提码-SELF_PICK_CODE ；口令-PASSWORD；取餐码-MEAL_NUM
	 */
	@ApiField("pick_up_type")
	private String pickUpType;

	/**
	 * 桌号，点餐先付-送餐到桌场景必填
	 */
	@ApiField("table_num")
	private String tableNum;

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

	public String getTableNum() {
		return this.tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
