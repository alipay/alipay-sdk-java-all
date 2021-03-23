package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.certinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 19:32:28
 */
public class AlipayEcoCityserviceCertinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3445731443551986873L;

	/** 
	 * 用户证件信息查询结果列表。列表中的元素包含请求证件信息，以及对应的支付宝uid信息。
	 */
	@ApiListField("result_list")
	@ApiField("cert_info_response")
	private List<CertInfoResponse> resultList;

	public void setResultList(List<CertInfoResponse> resultList) {
		this.resultList = resultList;
	}
	public List<CertInfoResponse> getResultList( ) {
		return this.resultList;
	}

}
