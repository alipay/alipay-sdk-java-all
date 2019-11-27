package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开启合约审批返回结果
 *
 * @author auto create
 * @since 1.0, 2019-11-13 16:19:56
 */
public class InterTradeStartContractApprovalResult extends AlipayObject {

	private static final long serialVersionUID = 1482723998144751658L;

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
