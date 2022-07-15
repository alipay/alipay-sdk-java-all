package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HelloBikePriceResultItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.smartprice.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:39
 */
public class AlipayDataAiserviceSmartpriceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6379474865532286279L;

	/** 
	 * 兼容V1.0。用户购买hellobike月卡的推荐价格，单位为分。
	 */
	@ApiField("promo_price_cent")
	private Long promoPriceCent;

	/** 
	 * 返回结果列表
	 */
	@ApiListField("result")
	@ApiField("hello_bike_price_result_item")
	private List<HelloBikePriceResultItem> result;

	public void setPromoPriceCent(Long promoPriceCent) {
		this.promoPriceCent = promoPriceCent;
	}
	public Long getPromoPriceCent( ) {
		return this.promoPriceCent;
	}

	public void setResult(List<HelloBikePriceResultItem> result) {
		this.result = result;
	}
	public List<HelloBikePriceResultItem> getResult( ) {
		return this.result;
	}

}
