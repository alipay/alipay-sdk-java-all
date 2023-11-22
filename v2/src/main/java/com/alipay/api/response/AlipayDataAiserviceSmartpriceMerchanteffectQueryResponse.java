package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantEffectQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.smartprice.merchanteffect.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:14:17
 */
public class AlipayDataAiserviceSmartpriceMerchanteffectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3621277792113818723L;

	/** 
	 * 商家效果展示列表返回值
	 */
	@ApiListField("result")
	@ApiField("merchant_effect_query_result")
	private List<MerchantEffectQueryResult> result;

	/** 
	 * 最小定价单元,返回为""代表统计了该商户下所有定价单元指标之和
	 */
	@ApiField("unit_id")
	private String unitId;

	public void setResult(List<MerchantEffectQueryResult> result) {
		this.result = result;
	}
	public List<MerchantEffectQueryResult> getResult( ) {
		return this.result;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getUnitId( ) {
		return this.unitId;
	}

}
