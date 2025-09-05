package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountApplyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.subaccount.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-08 16:41:56
 */
public class AnttechOceanbaseSubaccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3128966356748678511L;

	/** 
	 * 财资子户申请结果返回结果
	 */
	@ApiField("sub_account_apply_result")
	private SubAccountApplyResult subAccountApplyResult;

	public void setSubAccountApplyResult(SubAccountApplyResult subAccountApplyResult) {
		this.subAccountApplyResult = subAccountApplyResult;
	}
	public SubAccountApplyResult getSubAccountApplyResult( ) {
		return this.subAccountApplyResult;
	}

}
