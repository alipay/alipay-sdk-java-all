package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas账号修改
 *
 * @author auto create
 * @since 1.0, 2026-08-25 20:22:50
 */
public class AlipayTradeSaasAccountModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6442672837468524592L;

	/**
	 * 需要变更企业主体信息的SaaS客户ID。该客户必须属于当前调用商户，且当前仅允许存在一个可用银行转账账户。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 变更后的企业登记号。企业主体发生变化且未命中企业真实性校验豁免配置时必填；企业名称未变化且本字段不传时保留原企业登记号。
	 */
	@ApiField("enterprise_registration_no")
	private String enterpriseRegistrationNo;

	/**
	 * 变更后的企业名称。与当前企业名称和企业登记号均一致时按幂等成功返回。
	 */
	@ApiField("out_merchant_name")
	private String outMerchantName;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEnterpriseRegistrationNo() {
		return this.enterpriseRegistrationNo;
	}
	public void setEnterpriseRegistrationNo(String enterpriseRegistrationNo) {
		this.enterpriseRegistrationNo = enterpriseRegistrationNo;
	}

	public String getOutMerchantName() {
		return this.outMerchantName;
	}
	public void setOutMerchantName(String outMerchantName) {
		this.outMerchantName = outMerchantName;
	}

}
