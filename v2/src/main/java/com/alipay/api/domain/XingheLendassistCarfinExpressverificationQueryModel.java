package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物品资料核验结果查询
 *
 * @author auto create
 * @since 1.0, 2026-06-25 21:32:58
 */
public class XingheLendassistCarfinExpressverificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5717755112168367967L;

	/**
	 * 星河侧快递订单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 外部快递订单号
	 */
	@ApiField("out_express_no")
	private String outExpressNo;

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getOutExpressNo() {
		return this.outExpressNo;
	}
	public void setOutExpressNo(String outExpressNo) {
		this.outExpressNo = outExpressNo;
	}

}
