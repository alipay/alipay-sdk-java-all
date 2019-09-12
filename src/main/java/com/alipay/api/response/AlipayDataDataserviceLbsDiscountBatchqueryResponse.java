package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntlbsKBDiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.lbs.discount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceLbsDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1376666917831435737L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("antlbs_k_b_discount_info")
	private List<AntlbsKBDiscountInfo> discounts;

	public void setDiscounts(List<AntlbsKBDiscountInfo> discounts) {
		this.discounts = discounts;
	}
	public List<AntlbsKBDiscountInfo> getDiscounts( ) {
		return this.discounts;
	}

}
