package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.product.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-09 18:37:42
 */
public class AlipayOpenSpInteopProductCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3742325139125226688L;

	/** 
	 * 产品添加开通失败原因说明
	 */
	@ApiListField("memos")
	@ApiField("string")
	private List<String> memos;

	/** 
	 * 一体化作业子项单号
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
