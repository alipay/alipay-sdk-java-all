package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业业务订单查询
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:29
 */
public class AlipayEbppIndustryOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8264791715229177664L;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
