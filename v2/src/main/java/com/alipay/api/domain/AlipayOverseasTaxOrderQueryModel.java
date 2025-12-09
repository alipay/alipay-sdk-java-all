package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-18 20:57:15
 */
public class AlipayOverseasTaxOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2654918752162349782L;

	/**
	 * 退税机构业务流水号，唯一，由退税机构生成，只能包含英字母、数字，长度不能小于3且不能大于64
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
