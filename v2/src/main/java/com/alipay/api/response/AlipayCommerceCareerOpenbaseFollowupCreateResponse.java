package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.openbase.followup.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-15 14:51:55
 */
public class AlipayCommerceCareerOpenbaseFollowupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3851927822514892612L;

	/** 
	 * 平台任务号,按字符串处理,勿解析内部结构);用于回告与计费对账。查询、取消以 outBizNo 定位。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 三方业务单号,appId 下唯一,作为创建幂等键;1~64 位英文字母与数字(纯数字可用、不强制),勿用下划线等符号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
