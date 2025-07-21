package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询人群
 *
 * @author auto create
 * @since 1.0, 2025-07-07 10:13:12
 */
public class AlipayUserDtbankCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2283718286838386673L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
