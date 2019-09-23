package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MakePriceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.priceoptimizer.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 16:58:58
 */
public class AlipayDataAiservicePriceoptimizerGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6556923144548588292L;

	/** 
	 * 推荐价格返回列表
	 */
	@ApiListField("result")
	@ApiField("make_price_result")
	private List<MakePriceResult> result;

	public void setResult(List<MakePriceResult> result) {
		this.result = result;
	}
	public List<MakePriceResult> getResult( ) {
		return this.result;
	}

}
