package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家地址修改申请
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class DistributionProcessBuyerAddressModifyApplyDTO extends AlipayObject {

	private static final long serialVersionUID = 4714841953569418627L;

	/**
	 * 是否同意；true：表示同意，false：表示不同意
	 */
	@ApiField("agree")
	private Boolean agree;

	public Boolean getAgree() {
		return this.agree;
	}
	public void setAgree(Boolean agree) {
		this.agree = agree;
	}

}
