package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmountDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.budgetapply.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 11:42:58
 */
public class AlipayDataDataserviceAdBudgetapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3269955233796532142L;

	/** 
	 * 实际划拨金额明细，资金端未返回时为空
单位为“元”，支持两位小数
	 */
	@ApiField("amount_detail")
	private AmountDetail amountDetail;

	/** 
	 * 第三方申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 资金当前流水状态：处理中-WAITING；成功-SUCCESS；失败-FAIL
	 */
	@ApiField("status")
	private String status;

	public void setAmountDetail(AmountDetail amountDetail) {
		this.amountDetail = amountDetail;
	}
	public AmountDetail getAmountDetail( ) {
		return this.amountDetail;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
