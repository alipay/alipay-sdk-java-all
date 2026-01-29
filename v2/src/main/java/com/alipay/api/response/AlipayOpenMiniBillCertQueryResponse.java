package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bill.cert.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-29 17:47:41
 */
public class AlipayOpenMiniBillCertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7477316752489743236L;

	/** 
	 * 查询返回的账单
	 */
	@ApiListField("response")
	@ApiField("cert_bill_detail")
	private List<CertBillDetail> response;

	public void setResponse(List<CertBillDetail> response) {
		this.response = response;
	}
	public List<CertBillDetail> getResponse( ) {
		return this.response;
	}

}
