package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业提交子项开通单
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:03
 */
public class AlipayOpenSpInteopOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7541396865132894256L;

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
