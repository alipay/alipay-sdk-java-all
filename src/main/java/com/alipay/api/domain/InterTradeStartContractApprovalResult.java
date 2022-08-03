package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开启合约审批返回结果
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:59:15
 */
public class InterTradeStartContractApprovalResult extends AlipayObject {

	private static final long serialVersionUID = 3612426351864175492L;

	/**
	 * true：需要蚂蚁关联交易审批
false：不需要蚂蚁关联交易审批
	 */
	@ApiField("need_approval_flag")
	private Boolean needApprovalFlag;

	public Boolean getNeedApprovalFlag() {
		return this.needApprovalFlag;
	}
	public void setNeedApprovalFlag(Boolean needApprovalFlag) {
		this.needApprovalFlag = needApprovalFlag;
	}

}
