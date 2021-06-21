package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务标准化的商户信息
 *
 * @author auto create
 * @since 1.0, 2021-06-18 11:02:39
 */
public class CateringMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 6596488311162712763L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商家logo（上传logo图片返回的material_key）
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 直连商户id。除排队之外，特殊可选
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 间联商户。除排队之外，特殊可选，pid smid 必有一个。银行ISV将商户入驻得到的sub_merchant_id，受理商户唯一标识。
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
