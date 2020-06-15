package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税查询接口
 *
 * @author auto create
 * @since 1.0, 2019-11-14 12:00:48
 */
public class AlipayOverseasTaxOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5433875848187975931L;

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
