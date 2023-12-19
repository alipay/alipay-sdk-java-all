package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.pbc.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:51:34
 */
public class AlipayFinancialnetAuthPbcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2189788183521737933L;

	/** 
	 * 联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/** 
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 城市信息
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 顶级机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 顶级机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/** 
	 * 省份信息
	 */
	@ApiField("provice")
	private String provice;

	/** 
	 * 承接的清算机构
	 */
	@ApiField("undertake_inst")
	private String undertakeInst;

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankCode( ) {
		return this.bankCode;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName( ) {
		return this.branchName;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getProvice( ) {
		return this.provice;
	}

	public void setUndertakeInst(String undertakeInst) {
		this.undertakeInst = undertakeInst;
	}
	public String getUndertakeInst( ) {
		return this.undertakeInst;
	}

}
