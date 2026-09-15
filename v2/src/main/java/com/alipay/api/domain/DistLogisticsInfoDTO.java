package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货物流信息
 *
 * @author auto create
 * @since 1.0, 2026-09-11 10:43:06
 */
public class DistLogisticsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2385154945354498537L;

	/**
	 * 快递公司名称
	 */
	@ApiField("express_comp_name")
	private String expressCompName;

	/**
	 * 快递单号
	 */
	@ApiField("express_no")
	private String expressNo;

	public String getExpressCompName() {
		return this.expressCompName;
	}
	public void setExpressCompName(String expressCompName) {
		this.expressCompName = expressCompName;
	}

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

}
