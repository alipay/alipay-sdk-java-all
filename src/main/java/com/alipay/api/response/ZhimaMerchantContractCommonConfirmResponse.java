package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.common.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-18 20:00:08
 */
public class ZhimaMerchantContractCommonConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8539336112982115431L;

	/** 
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

}
