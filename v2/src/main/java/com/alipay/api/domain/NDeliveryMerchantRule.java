package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 曝光商户信息
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:12
 */
public class NDeliveryMerchantRule extends AlipayObject {

	private static final long serialVersionUID = 8342468662961235525L;

	/**
	 * 传入需曝光的碰一下支付成功页对应的收单账号
	 */
	@ApiListField("n_delivery_merchant_infos")
	@ApiField("n_delivery_merchant_infos")
	private List<NDeliveryMerchantInfos> nDeliveryMerchantInfos;

	/**
	 * 碰一下支付成功页曝光模式。
枚举值：
·MANUAL_INPUT_SOURCE_MERCHANT：指定进件商户收单账号
	 */
	@ApiField("n_delivery_merchant_mode")
	private String nDeliveryMerchantMode;

	public List<NDeliveryMerchantInfos> getnDeliveryMerchantInfos() {
		return this.nDeliveryMerchantInfos;
	}
	public void setnDeliveryMerchantInfos(List<NDeliveryMerchantInfos> nDeliveryMerchantInfos) {
		this.nDeliveryMerchantInfos = nDeliveryMerchantInfos;
	}

	public String getnDeliveryMerchantMode() {
		return this.nDeliveryMerchantMode;
	}
	public void setnDeliveryMerchantMode(String nDeliveryMerchantMode) {
		this.nDeliveryMerchantMode = nDeliveryMerchantMode;
	}

}
