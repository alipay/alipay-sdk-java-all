package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务标准化的商户信息
 *
 * @author auto create
 * @since 1.0, 2021-07-09 14:30:44
 */
public class CateringMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 8629185598886682217L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商家logo（上传logo图片返回的material_key）。平台小程序必填；模板或自研小程序选填，不填官方会取小程序Logo
请使用此文档集的图片上传接口上传获取的ID
（alipay.merchant.item.file.upload）
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 品牌在支付宝商家平台的PID。除排队场景外，PID/SMID必填一个。
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 品牌在支付宝商家平台的入驻得到的sub_merchant_id，受理商户唯一标识。除排队场景外，PID/SMID必填一个。
	 */
	@ApiField("smid")
	private String smid;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
