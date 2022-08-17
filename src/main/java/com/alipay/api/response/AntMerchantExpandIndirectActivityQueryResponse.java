package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityMerchantOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-29 13:51:00
 */
public class AntMerchantExpandIndirectActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8588226318922667459L;

	/** 
	 * 多活动申请返回结果
	 */
	@ApiListField("multi_result")
	@ApiField("activity_merchant_order")
	private List<ActivityMerchantOrder> multiResult;

	/** 
	 * 费率申请通过后实际生效的费率值，只有0或者0.001两种可能情况。当status字段返回TRUE时此字段有值，反之不返回费率信息
	 */
	@ApiField("rate")
	private String rate;

	/** 
	 * 费率申请审核结果status的值：true（通过），false（拒绝），AUDITING（审核中）
	 */
	@ApiField("status")
	private String status;

	public void setMultiResult(List<ActivityMerchantOrder> multiResult) {
		this.multiResult = multiResult;
	}
	public List<ActivityMerchantOrder> getMultiResult( ) {
		return this.multiResult;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate( ) {
		return this.rate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
