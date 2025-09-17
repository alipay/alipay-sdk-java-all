package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多云财资子户申请
 *
 * @author auto create
 * @since 1.0, 2024-01-08 16:38:28
 */
public class AnttechOceanbaseSubaccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7134516733858327955L;

	/**
	 * 财资子户申请入参模型
	 */
	@ApiField("sub_account_apply_request")
	private SubAccountApplyRequest subAccountApplyRequest;

	public SubAccountApplyRequest getSubAccountApplyRequest() {
		return this.subAccountApplyRequest;
	}
	public void setSubAccountApplyRequest(SubAccountApplyRequest subAccountApplyRequest) {
		this.subAccountApplyRequest = subAccountApplyRequest;
	}

}
