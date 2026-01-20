package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.enterprisecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-25 10:27:42
 */
public class AlipayOpenSpInteopEnterprisecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2483413468592233335L;

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
