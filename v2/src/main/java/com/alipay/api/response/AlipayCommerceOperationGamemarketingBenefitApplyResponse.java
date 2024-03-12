package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.gamemarketing.benefit.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:56:50
 */
public class AlipayCommerceOperationGamemarketingBenefitApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4181429852471151798L;

	/** 
	 * 返回值是个卡券兑换码的列表
	 */
	@ApiListField("apply_voucher_code_list")
	@ApiField("string")
	private List<String> applyVoucherCodeList;

	public void setApplyVoucherCodeList(List<String> applyVoucherCodeList) {
		this.applyVoucherCodeList = applyVoucherCodeList;
	}
	public List<String> getApplyVoucherCodeList( ) {
		return this.applyVoucherCodeList;
	}

}
