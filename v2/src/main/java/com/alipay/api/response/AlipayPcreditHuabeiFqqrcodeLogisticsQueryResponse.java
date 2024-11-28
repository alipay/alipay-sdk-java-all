package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.fqqrcode.logistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:01:43
 */
public class AlipayPcreditHuabeiFqqrcodeLogisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5527249729218343349L;

	/** 
	 * 承接物料运输订单的快递公司名称
	 */
	@ApiField("express_company_name")
	private String expressCompanyName;

	/** 
	 * 物流单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/** 
	 * 物料订单当前状态."配送指令已下达未拉取"表示正在生产,待揽收;"揽收完成"标识物流公司已经完成揽收;"配送中"表示物流正在运输或物流已结束.
	 */
	@ApiField("status")
	private String status;

	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}
	public String getExpressCompanyName( ) {
		return this.expressCompanyName;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	public String getExpressNo( ) {
		return this.expressNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
