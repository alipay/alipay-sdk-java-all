package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV单个订单返佣详情查询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:08:52
 */
public class AntMerchantExpandEcoOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4896374198752712998L;

	/**
	 * 交易平台
	 */
	@ApiField("busi_platform")
	private String busiPlatform;

	/**
	 * 生态供应商编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 交易平台订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 生态供应商店铺编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	public String getBusiPlatform() {
		return this.busiPlatform;
	}
	public void setBusiPlatform(String busiPlatform) {
		this.busiPlatform = busiPlatform;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

}
