package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiSignQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:36:39
 */
public class AlipayUserAgreementBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4356812963863114754L;

	/** 
	 * 用户签约协议列表
	 */
	@ApiListField("usage_agreement_info_list")
	@ApiField("open_api_sign_query_response")
	private List<OpenApiSignQueryResponse> usageAgreementInfoList;

	public void setUsageAgreementInfoList(List<OpenApiSignQueryResponse> usageAgreementInfoList) {
		this.usageAgreementInfoList = usageAgreementInfoList;
	}
	public List<OpenApiSignQueryResponse> getUsageAgreementInfoList( ) {
		return this.usageAgreementInfoList;
	}

}
