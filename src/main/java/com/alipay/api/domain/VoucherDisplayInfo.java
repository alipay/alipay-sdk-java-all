package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券展示信息
 *
 * @author auto create
 * @since 1.0, 2021-05-09 19:19:49
 */
public class VoucherDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 5437758834296319699L;

	/**
	 * 商户品牌名称。

如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。

如果没有维护商家别名，则使用默认名称：

商家优惠。

用户领取优惠券后，品牌名称会对用户进行展示
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 券详细使用说明。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

}
