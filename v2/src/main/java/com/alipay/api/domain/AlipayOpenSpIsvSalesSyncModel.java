package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户销售数据回传接口
 *
 * @author auto create
 * @since 1.0, 2022-10-31 14:02:22
 */
public class AlipayOpenSpIsvSalesSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5283459947672755572L;

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
