package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户销售数据回传接口
 *
 * @author auto create
 * @since 1.0, 2025-09-15 11:44:06
 */
public class AlipayOpenSpIsvSalesSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2687313782631389447L;

	/**
	 * 商户销售数据回传的参数对象，形式为一个列表，每天回传昨日商户的销售数据。
	 */
	@ApiListField("merchant_sales_detail")
	@ApiField("isv_merchant_sales_detail_request")
	private List<IsvMerchantSalesDetailRequest> merchantSalesDetail;

	public List<IsvMerchantSalesDetailRequest> getMerchantSalesDetail() {
		return this.merchantSalesDetail;
	}
	public void setMerchantSalesDetail(List<IsvMerchantSalesDetailRequest> merchantSalesDetail) {
		this.merchantSalesDetail = merchantSalesDetail;
	}

}
