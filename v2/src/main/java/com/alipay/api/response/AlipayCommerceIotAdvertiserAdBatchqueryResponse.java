package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreationPlanData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:48:37
 */
public class AlipayCommerceIotAdvertiserAdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7591341376164671193L;

	/** 
	 * 投放计划列表数组
	 */
	@ApiListField("result")
	@ApiField("creation_plan_data")
	private List<CreationPlanData> result;

	/** 
	 * 计划总数
	 */
	@ApiField("total")
	private Long total;

	public void setResult(List<CreationPlanData> result) {
		this.result = result;
	}
	public List<CreationPlanData> getResult( ) {
		return this.result;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
