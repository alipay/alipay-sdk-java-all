package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码点餐非官方物料数据上传
 *
 * @author auto create
 * @since 1.0, 2021-07-23 11:50:55
 */
public class AlipayCommerceOperationUnofficialMaterialSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2768259997364616279L;

	/**
	 * 在支付宝开放平台中，服务商的pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 支付宝小程序的app id。商家的扫码点餐物料对应的小程序的app id。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 二维码码值。桌码、台码、电子屏等展示的扫码点餐二维码的码值。
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * 政策返佣的pid。填写isv在支付宝开放平台的pid。
	 */
	@ApiField("rebate_pid")
	private String rebatePid;

	/**
	 * 商家收单的pid（直连商户id）
	 */
	@ApiField("seller_checkout_pid")
	private String sellerCheckoutPid;

	/**
	 * 商家收单的smid（间联商户id）
	 */
	@ApiField("seller_checkout_smid")
	private String sellerCheckoutSmid;

	/**
	 * 商家的支付宝门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	public String getRebatePid() {
		return this.rebatePid;
	}
	public void setRebatePid(String rebatePid) {
		this.rebatePid = rebatePid;
	}

	public String getSellerCheckoutPid() {
		return this.sellerCheckoutPid;
	}
	public void setSellerCheckoutPid(String sellerCheckoutPid) {
		this.sellerCheckoutPid = sellerCheckoutPid;
	}

	public String getSellerCheckoutSmid() {
		return this.sellerCheckoutSmid;
	}
	public void setSellerCheckoutSmid(String sellerCheckoutSmid) {
		this.sellerCheckoutSmid = sellerCheckoutSmid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
