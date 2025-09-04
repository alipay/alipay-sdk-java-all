package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.funcardassert.return response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 10:52:21
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardassertReturnResponse extends AlipayResponse {

	private static final long serialVersionUID = 8262784595293288558L;

	/** 
	 * 实际扣的花呗金个数，花呗金单位个
	 */
	@ApiField("actual_point")
	private Long actualPoint;

	/** 
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 扣减状态值
	 */
	@ApiField("decrease_status")
	private String decreaseStatus;

	/** 
	 * 单据号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setActualPoint(Long actualPoint) {
		this.actualPoint = actualPoint;
	}
	public Long getActualPoint( ) {
		return this.actualPoint;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setDecreaseStatus(String decreaseStatus) {
		this.decreaseStatus = decreaseStatus;
	}
	public String getDecreaseStatus( ) {
		return this.decreaseStatus;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
