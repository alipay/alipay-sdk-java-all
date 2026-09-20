package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.account.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 20:22:50
 */
public class AlipayTradeSaasAccountModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5732323898823952418L;

	/** 
	 * 完成企业主体信息变更的SaaS客户ID。
	 */
	@ApiField("customer_id")
	private String customerId;

	/** 
	 * 当前生效的企业登记号。账户未保存企业登记号时不返回。
	 */
	@ApiField("enterprise_registration_no")
	private String enterpriseRegistrationNo;

	/** 
	 * 当前生效的企业名称。
	 */
	@ApiField("out_merchant_name")
	private String outMerchantName;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

	public void setEnterpriseRegistrationNo(String enterpriseRegistrationNo) {
		this.enterpriseRegistrationNo = enterpriseRegistrationNo;
	}
	public String getEnterpriseRegistrationNo( ) {
		return this.enterpriseRegistrationNo;
	}

	public void setOutMerchantName(String outMerchantName) {
		this.outMerchantName = outMerchantName;
	}
	public String getOutMerchantName( ) {
		return this.outMerchantName;
	}

}
