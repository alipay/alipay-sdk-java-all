package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.gencard.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 17:56:48
 */
public class AlipayFundMbpcardGencardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7361999358786797923L;

	/** 
	 * 制卡单据下单成功之后返回的单号，可以用来查询进度
	 */
	@ApiField("gen_card_no")
	private String genCardNo;

	/** 
	 * 表示制卡单据的业务状态
	 */
	@ApiField("status")
	private String status;

	public void setGenCardNo(String genCardNo) {
		this.genCardNo = genCardNo;
	}
	public String getGenCardNo( ) {
		return this.genCardNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
