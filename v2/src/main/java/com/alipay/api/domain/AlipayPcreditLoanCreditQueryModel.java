package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询授信额度
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:26:07
 */
public class AlipayPcreditLoanCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3842351611245928754L;

	/**
	 * 同提交授信接口请求参数中的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
