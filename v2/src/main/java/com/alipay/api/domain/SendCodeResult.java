package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家发放码值的结果
 *
 * @author auto create
 * @since 1.0, 2024-05-15 16:15:09
 */
public class SendCodeResult extends AlipayObject {

	private static final long serialVersionUID = 5236872969336139672L;

	/**
	 * 服务商发奖后返回的券码列表
	 */
	@ApiField("code")
	private String code;

	/**
	 * 发奖后返回的与券码对应的券码使用链接，在支付宝卡包-券详情以二维码方式展示 当前字段已废弃(后续可使用qr_code)
	 */
	@ApiField("code_url")
	@Deprecated
	private String codeUrl;

	/**
	 * 支付宝的商品信息
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用户领券之后在服务商(商户)侧提供的券详情展示页面。在支付宝卡包中展示链接，用户点击可以跳转到服务商券详情页 当前字段已废弃(无效参数本地商品未应用)
	 */
	@ApiField("merchant_order_url")
	@Deprecated
	private String merchantOrderUrl;

	/**
	 * 商家侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧sku ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 三方码二维码值，可填入URL或字符串。长度不能超过512。
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 支付宝平台侧sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMerchantOrderUrl() {
		return this.merchantOrderUrl;
	}
	public void setMerchantOrderUrl(String merchantOrderUrl) {
		this.merchantOrderUrl = merchantOrderUrl;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
