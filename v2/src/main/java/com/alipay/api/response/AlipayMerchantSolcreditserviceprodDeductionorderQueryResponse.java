package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeductionOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.deductionorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:54
 */
public class AlipayMerchantSolcreditserviceprodDeductionorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4338316546453295391L;

	/** 
	 * 数据列表
	 */
	@ApiListField("deduction_order_list")
	@ApiField("deduction_order_d_t_o")
	private List<DeductionOrderDTO> deductionOrderList;

	public void setDeductionOrderList(List<DeductionOrderDTO> deductionOrderList) {
		this.deductionOrderList = deductionOrderList;
	}
	public List<DeductionOrderDTO> getDeductionOrderList( ) {
		return this.deductionOrderList;
	}

}
