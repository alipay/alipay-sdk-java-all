package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.institutionpayment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:23:47
 */
public class AlipayOverseasTransferInstitutionpaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6338343841767868315L;

	/** 
	 * 透传保留字段，json map格式
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 学校缴费项列表List<PaymemtDetail>
	 */
	@ApiListField("payment_details")
	@ApiField("string")
	private List<String> paymentDetails;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setPaymentDetails(List<String> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public List<String> getPaymentDetails( ) {
		return this.paymentDetails;
	}

}
