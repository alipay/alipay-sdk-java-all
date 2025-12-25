package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业提交子项开通单
 *
 * @author auto create
 * @since 1.0, 2025-12-15 23:22:04
 */
public class AlipayOpenSpInteopOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1891751772361447786L;

	/**
	 * 选择异步提交，根据alipay.open.sp.inteop.order.query接口查询订单提交结果
	 */
	@ApiField("async_submit")
	private Boolean asyncSubmit;

	/**
	 * 服务商一体化作业主单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	public Boolean getAsyncSubmit() {
		return this.asyncSubmit;
	}
	public void setAsyncSubmit(Boolean asyncSubmit) {
		this.asyncSubmit = asyncSubmit;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

}
