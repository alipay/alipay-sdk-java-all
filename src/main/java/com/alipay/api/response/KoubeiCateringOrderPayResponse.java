package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 22:18:02
 */
public class KoubeiCateringOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6634411459896421244L;

	/** 
	 * online_pay：表示在线买单跳转地址
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 该支付宝门店对应商家的partnerId号
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 支付宝门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 当前用户操作的桌码
	 */
	@ApiField("table_num")
	private String tableNum;

	/** 
	 * 当前操作用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	public String getTableNum( ) {
		return this.tableNum;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
