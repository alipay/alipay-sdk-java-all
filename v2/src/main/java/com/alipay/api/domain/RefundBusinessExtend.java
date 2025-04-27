package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 原路退扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-07-31 19:37:52
 */
public class RefundBusinessExtend extends AlipayObject {

	private static final long serialVersionUID = 7676224352736768168L;

	/**
	 * 退款机构咨询
	 */
	@ApiField("refund_inst_consult")
	private String refundInstConsult;

	public String getRefundInstConsult() {
		return this.refundInstConsult;
	}
	public void setRefundInstConsult(String refundInstConsult) {
		this.refundInstConsult = refundInstConsult;
	}

}
