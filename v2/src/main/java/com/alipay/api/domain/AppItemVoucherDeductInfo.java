package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherDeductInfo extends AlipayObject {

	private static final long serialVersionUID = 7639773496769263732L;

	/**
	 * 满减券 当promoType=FIX_AMOUNT时不能为空
	 */
	@ApiField("app_item_fix_voucher_info")
	private AppItemFixVoucherInfo appItemFixVoucherInfo;

	/**
	 * 【描述】券类型
【枚举值】
● 满减：FIX_AMOUNT
	 */
	@ApiField("promo_type")
	private String promoType;

	public AppItemFixVoucherInfo getAppItemFixVoucherInfo() {
		return this.appItemFixVoucherInfo;
	}
	public void setAppItemFixVoucherInfo(AppItemFixVoucherInfo appItemFixVoucherInfo) {
		this.appItemFixVoucherInfo = appItemFixVoucherInfo;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

}
