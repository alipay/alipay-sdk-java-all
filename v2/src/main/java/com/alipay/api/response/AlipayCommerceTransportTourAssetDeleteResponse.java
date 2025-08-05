package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.asset.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 22:02:33
 */
public class AlipayCommerceTransportTourAssetDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8835647266813325816L;

	/** 
	 * 出库失败的订单号列表。
结构：outBizNo|outVoucherId
	 */
	@ApiListField("fail_out_biz_no")
	@ApiField("string")
	private List<String> failOutBizNo;

	/** 
	 * 出库成功的订单号列表
结构：outBizNo|outVoucherId
	 */
	@ApiListField("success_out_biz_no")
	@ApiField("string")
	private List<String> successOutBizNo;

	public void setFailOutBizNo(List<String> failOutBizNo) {
		this.failOutBizNo = failOutBizNo;
	}
	public List<String> getFailOutBizNo( ) {
		return this.failOutBizNo;
	}

	public void setSuccessOutBizNo(List<String> successOutBizNo) {
		this.successOutBizNo = successOutBizNo;
	}
	public List<String> getSuccessOutBizNo( ) {
		return this.successOutBizNo;
	}

}
