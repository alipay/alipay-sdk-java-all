package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.iot.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:30:03
 */
public class AlipayMerchantIotDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7718953462332535136L;

	/** 
	 * 商户类型。direct表示直连商户，indirect表示间连商户。
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/** 
	 * 设备绑定的商户支付宝pid。直连场景为商户收单pid，间连场景为商户smid绑定的pid。
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 设备绑定的门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 商户smid。直连场景为空。
	 */
	@ApiField("smid")
	private String smid;

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getMerchantType( ) {
		return this.merchantType;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

}
