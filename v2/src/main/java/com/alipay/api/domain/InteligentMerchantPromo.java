package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销自运营活动
 *
 * @author auto create
 * @since 1.0, 2018-01-22 19:53:03
 */
public class InteligentMerchantPromo extends AlipayObject {

	private static final long serialVersionUID = 5696263442161714315L;

	/**
	 * 商户自运营活动，当promo_type='GENERAL_MERCHANT',该对象不能为空，其他类型无效
	 */
	@ApiField("general_promo")
	private InteligentGeneralMerchantPromo generalPromo;

	/**
	 * 子活动营销类型；枚举值：（GENERAL_MERCHANT：商户自运营活动）
	 */
	@ApiField("promo_type")
	private String promoType;

	public InteligentGeneralMerchantPromo getGeneralPromo() {
		return this.generalPromo;
	}
	public void setGeneralPromo(InteligentGeneralMerchantPromo generalPromo) {
		this.generalPromo = generalPromo;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

}
