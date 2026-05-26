package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.transfer.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 17:17:45
 */
public class AlipayCommerceLogisticsFreightflowTransferApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2681628818617386586L;

	/** 
	 * 银行操作单号(查询时需要使用)
	 */
	@ApiField("bank_operate_no")
	private String bankOperateNo;

	/** 
	 * 业务幂等号(同入参中的业务幂等号一致)
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 手续费,单位为'分',mode为浦发银行时可能包含手续费
	 */
	@ApiField("charges")
	private String charges;

	/** 
	 * 手续费承担方
	 */
	@ApiField("charges_payer")
	private String chargesPayer;

	/** 
	 * 合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 当mode为网商银行时：
SUCCESS(受理成功)，FAIL(受理失败)，UNKNOWN(受理未知) SUCCESS代表受理成功，后续通过查询接口拿到最终的处理结果 FAIL代表受理失败 UNKNOWN代表结果未知，不能判断为受理成功或者失败

当mode为浦发银行时：
SUCCESS代表转账成功
FAIL代表转账失败
DEALING代表转账处理中
UNKNOWN代表转账状态未知,可联系工作人员进行确认
	 */
	@ApiField("status")
	private String status;

	public void setBankOperateNo(String bankOperateNo) {
		this.bankOperateNo = bankOperateNo;
	}
	public String getBankOperateNo( ) {
		return this.bankOperateNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getCharges( ) {
		return this.charges;
	}

	public void setChargesPayer(String chargesPayer) {
		this.chargesPayer = chargesPayer;
	}
	public String getChargesPayer( ) {
		return this.chargesPayer;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
