package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车商户信息
 *
 * @author auto create
 * @since 1.0, 2021-06-10 14:25:03
 */
public class CarRentalMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 1685696555426555184L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌统一的服务电话
	 */
	@ApiField("merchant_contact")
	private String merchantContact;

	/**
	 * 直连商户id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 间联商户
	 */
	@ApiField("smid")
	private String smid;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMerchantContact() {
		return this.merchantContact;
	}
	public void setMerchantContact(String merchantContact) {
		this.merchantContact = merchantContact;
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
