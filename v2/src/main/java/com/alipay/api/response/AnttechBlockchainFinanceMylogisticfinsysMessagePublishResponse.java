package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.mylogisticfinsys.message.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:38:17
 */
public class AnttechBlockchainFinanceMylogisticfinsysMessagePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5558224626355734556L;

	/** 
	 * 返回值
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 额外信息，非json形式，如
	 */
	@ApiField("extra_info")
	private String extraInfo;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
	public String getExtraInfo( ) {
		return this.extraInfo;
	}

}
