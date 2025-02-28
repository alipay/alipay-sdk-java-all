package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 11:22:20
 */
public class AlipayOpenSpNordermaterialsapplyOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4481359639136883686L;

	/** 
	 * 申请单的状态描述
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 状态编码
	 */
	@ApiField("apply_status_code")
	private String applyStatusCode;

	/** 
	 * 该申请单下物料数量 ，单位个
	 */
	@ApiField("materials_num")
	private Long materialsNum;

	/** 
	 * 审批不通过的原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/** 
	 * 申请单下的门店订单数量
	 */
	@ApiField("shop_num")
	private Long shopNum;

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

	public void setApplyStatusCode(String applyStatusCode) {
		this.applyStatusCode = applyStatusCode;
	}
	public String getApplyStatusCode( ) {
		return this.applyStatusCode;
	}

	public void setMaterialsNum(Long materialsNum) {
		this.materialsNum = materialsNum;
	}
	public Long getMaterialsNum( ) {
		return this.materialsNum;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

	public void setShopNum(Long shopNum) {
		this.shopNum = shopNum;
	}
	public Long getShopNum( ) {
		return this.shopNum;
	}

}
