package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FeeItemPrice;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.fee.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 13:51:45
 */
public class AlipayCloudCloudbaseExtensionFeeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1469238611952949655L;

	/** 
	 * 各计费项单价
	 */
	@ApiListField("fee_item_prices")
	@ApiField("fee_item_price")
	private List<FeeItemPrice> feeItemPrices;

	public void setFeeItemPrices(List<FeeItemPrice> feeItemPrices) {
		this.feeItemPrices = feeItemPrices;
	}
	public List<FeeItemPrice> getFeeItemPrices( ) {
		return this.feeItemPrices;
	}

}
