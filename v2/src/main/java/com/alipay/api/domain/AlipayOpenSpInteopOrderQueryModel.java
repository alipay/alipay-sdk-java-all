package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商一体化开通作业查询业务开通单
 *
 * @author auto create
 * @since 1.0, 2025-10-23 20:35:13
 */
public class AlipayOpenSpInteopOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6613816955291452541L;

	/**
	 * 一体化作业业务开通主单号
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
