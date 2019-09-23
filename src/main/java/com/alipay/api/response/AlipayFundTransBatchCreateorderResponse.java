package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.batch.createorder response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundTransBatchCreateorderResponse extends AlipayResponse {

	private static final long serialVersionUID = 4189673277981372381L;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 扩展信息；创建付款单时传入的相关数据
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam( ) {
		return this.extParam;
	}

	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	public String getTransferNo( ) {
		return this.transferNo;
	}

}
