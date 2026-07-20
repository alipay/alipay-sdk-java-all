package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SignApplyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.routehub.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class AlipayCommerceAcommunicationCreditphoneRoutehubApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1114956856936471562L;

	/** 
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/** 
	 * 运营商侧订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 签约绑定响应明细
	 */
	@ApiField("sign_apply_result")
	private SignApplyResult signApplyResult;

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getOperationType( ) {
		return this.operationType;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setSignApplyResult(SignApplyResult signApplyResult) {
		this.signApplyResult = signApplyResult;
	}
	public SignApplyResult getSignApplyResult( ) {
		return this.signApplyResult;
	}

}
