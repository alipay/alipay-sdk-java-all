package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndrISVReceiptApplyResultDTO;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrreceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 13:51:42
 */
public class AlipayOverseasOpenIndrreceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1847799878771547176L;

	/** 
	 * 申请结果列表
	 */
	@ApiListField("apply_result_list")
	@ApiField("indr_i_s_v_receipt_apply_result_d_t_o")
	private List<IndrISVReceiptApplyResultDTO> applyResultList;

	/** 
	 * 调用结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setApplyResultList(List<IndrISVReceiptApplyResultDTO> applyResultList) {
		this.applyResultList = applyResultList;
	}
	public List<IndrISVReceiptApplyResultDTO> getApplyResultList( ) {
		return this.applyResultList;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
