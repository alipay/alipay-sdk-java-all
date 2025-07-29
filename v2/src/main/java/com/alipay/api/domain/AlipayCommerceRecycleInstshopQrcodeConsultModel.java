package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收即时到店门店二维码咨询
 *
 * @author auto create
 * @since 1.0, 2025-06-25 14:43:36
 */
public class AlipayCommerceRecycleInstshopQrcodeConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4332557321442846797L;

	/**
	 * 标准蚂蚁门店ID
	 */
	@ApiField("alipay_shop_id")
	private String alipayShopId;

	/**
	 * 支付宝回收分配给回收商家的线下即时到店模式的唯一身份编码.请联系对接人员获取
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getAlipayShopId() {
		return this.alipayShopId;
	}
	public void setAlipayShopId(String alipayShopId) {
		this.alipayShopId = alipayShopId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
