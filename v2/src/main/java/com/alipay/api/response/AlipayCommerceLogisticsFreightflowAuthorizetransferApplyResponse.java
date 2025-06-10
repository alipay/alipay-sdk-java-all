package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.authorizetransfer.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-28 17:02:27
 */
public class AlipayCommerceLogisticsFreightflowAuthorizetransferApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6583797997161853873L;

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
	 * 合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * SUCCESS(受理成功)，FAIL(受理失败)，UNKNOWN(受理未知) SUCCESS代表受理成功，后续通过查询接口拿到最终的处理结果 FAIL代表受理失败 UNKNOWN代表结果未知，不能判断为受理成功或者失败
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
