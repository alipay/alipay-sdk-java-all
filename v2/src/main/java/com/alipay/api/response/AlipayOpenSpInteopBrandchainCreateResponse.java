package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.brandchain.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-01 19:52:56
 */
public class AlipayOpenSpInteopBrandchainCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6413449254443518185L;

	/** 
	 * null
	 */
	@ApiListField("memos")
	@ApiField("string")
	private List<String> memos;

	/** 
	 * 一体化作业子单号	
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	public void setMemos(List<String> memos) {
		this.memos = memos;
	}
	public List<String> getMemos( ) {
		return this.memos;
	}

	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}
	public String getSubOrderNo( ) {
		return this.subOrderNo;
	}

}
