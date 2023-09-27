package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定优惠金额
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ReduceToAmtDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 3576293247413661926L;

	/**
	 * 优惠后价格
	 */
	@ApiField("reduct_to_amt")
	private String reductToAmt;

	public String getReductToAmt() {
		return this.reductToAmt;
	}
	public void setReductToAmt(String reductToAmt) {
		this.reductToAmt = reductToAmt;
	}

}
