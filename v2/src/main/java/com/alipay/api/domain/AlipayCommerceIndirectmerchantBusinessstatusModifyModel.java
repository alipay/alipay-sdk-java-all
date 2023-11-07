package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改间连商户经营状态
 *
 * @author auto create
 * @since 1.0, 2023-10-30 10:31:03
 */
public class AlipayCommerceIndirectmerchantBusinessstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3193252642261332997L;

	/**
	 * 商家经营状态
	 */
	@ApiField("business_status")
	private String businessStatus;

	/**
	 * 商户Pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getBusinessStatus() {
		return this.businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
