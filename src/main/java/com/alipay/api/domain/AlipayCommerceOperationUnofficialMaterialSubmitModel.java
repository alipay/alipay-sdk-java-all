package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码点餐非官方物料数据上传
 *
 * @author auto create
 * @since 1.0, 2021-08-24 19:49:18
 */
public class AlipayCommerceOperationUnofficialMaterialSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4198936154482779253L;

	/**
	 * 服务商身份，选择此字段，此PID为签约物料激励协议的pid（为奖励政策结算PID，请谨慎填写），isv_pid和open_seller_pid，只能一个字段有值。
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 物料档位。枚举值可以是：1,2,3,4。
	 */
	@ApiField("material_level")
	private String materialLevel;

	/**
	 * 支付宝小程序的app id。商家的扫码点餐物料对应的小程序的app id。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 自研商家身份，选择此字段，此PID为签约物料激励协议的pid（为奖励政策结算PID，请谨慎填写），isv_pid和open_seller_pid，只能一个字段有值。
	 */
	@ApiField("open_seller_pid")
	private String openSellerPid;

	/**
	 * 二维码码值。桌码、台码、电子屏等展示的扫码点餐二维码的码值。
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * 商家收单的pid（直连商户id）。seller_checkout_pid和seller_checkout_smid，这两个字段只能一个字段有值。
	 */
	@ApiField("seller_checkout_pid")
	private String sellerCheckoutPid;

	/**
	 * 商家收单的smid（间联商户id）。商家收单的pid和商家收单的smid，这两个字段只能一个字段有值。
	 */
	@ApiField("seller_checkout_smid")
	private String sellerCheckoutSmid;

	/**
	 * 商家的支付宝门店id。如果填写了，则会校验此字段与 商家收单的pid或者商家收单的smid 之间的关系。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMaterialLevel() {
		return this.materialLevel;
	}
	public void setMaterialLevel(String materialLevel) {
		this.materialLevel = materialLevel;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOpenSellerPid() {
		return this.openSellerPid;
	}
	public void setOpenSellerPid(String openSellerPid) {
		this.openSellerPid = openSellerPid;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
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
