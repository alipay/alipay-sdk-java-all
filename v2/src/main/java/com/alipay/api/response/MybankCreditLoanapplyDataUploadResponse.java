package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:22:17
 */
public class MybankCreditLoanapplyDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8463115583875526748L;

	/** 
	 * 数据在网商银行内部系统的唯一ID。由网商银行融资平台的系统生成，返回给外部机构。
	 */
	@ApiField("data_id")
	private String dataId;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

}
