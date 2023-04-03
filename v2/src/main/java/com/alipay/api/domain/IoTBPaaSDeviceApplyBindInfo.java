package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备绑定信息
 *
 * @author auto create
 * @since 1.0, 2021-01-30 18:24:57
 */
public class IoTBPaaSDeviceApplyBindInfo extends AlipayObject {

	private static final long serialVersionUID = 7719716189891558273L;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
