package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2021-08-23 19:11:12
 */
public class QrCodeBusinessParam extends AlipayObject {

	private static final long serialVersionUID = 1131485159134654919L;

	/**
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商户SMID
	 */
	@ApiField("merchant_smid")
	private String merchantSmid;

	/**
	 * 商户名称
	 */
	@ApiField("merhcant_name")
	private String merhcantName;

	/**
	 * 门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 商户支付宝门店编号
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMerchantSmid() {
		return this.merchantSmid;
	}
	public void setMerchantSmid(String merchantSmid) {
		this.merchantSmid = merchantSmid;
	}

	public String getMerhcantName() {
		return this.merhcantName;
	}
	public void setMerhcantName(String merhcantName) {
		this.merhcantName = merhcantName;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
