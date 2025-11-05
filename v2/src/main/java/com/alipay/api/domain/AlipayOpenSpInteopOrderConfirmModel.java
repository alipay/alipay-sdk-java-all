package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业提交子项开通单
 *
 * @author auto create
 * @since 1.0, 2025-10-23 20:35:18
 */
public class AlipayOpenSpInteopOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2549331255777931917L;

	/**
	 * 服务商一体化作业主单号
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
