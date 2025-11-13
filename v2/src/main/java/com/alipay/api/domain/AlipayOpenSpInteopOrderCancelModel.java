package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化作业取消业务开通单
 *
 * @author auto create
 * @since 1.0, 2025-10-22 17:04:21
 */
public class AlipayOpenSpInteopOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5727456394345458231L;

	/**
	 * 一体化作业开通主单号，单号为服务商一体化作业主单创建返回值。
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

}
