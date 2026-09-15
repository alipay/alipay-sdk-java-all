package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpPromoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.operation.promo.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 16:42:57
 */
public class AlipayPayAppOperationPromoTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 1775181347885859584L;

	/** 
	 * null
	 */
	@ApiListField("operation_promo_list")
	@ApiField("op_promo_info")
	private List<OpPromoInfo> operationPromoList;

	/** 
	 * 支付宝侧对于一次运营会话的标识，用于串联多阶段营销。
	 */
	@ApiField("pay_operation_info")
	private String payOperationInfo;

	public void setOperationPromoList(List<OpPromoInfo> operationPromoList) {
		this.operationPromoList = operationPromoList;
	}
	public List<OpPromoInfo> getOperationPromoList( ) {
		return this.operationPromoList;
	}

	public void setPayOperationInfo(String payOperationInfo) {
		this.payOperationInfo = payOperationInfo;
	}
	public String getPayOperationInfo( ) {
		return this.payOperationInfo;
	}

}
