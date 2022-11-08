package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林能量查询
 *
 * @author auto create
 * @since 1.0, 2022-06-09 14:49:27
 */
public class AlipayEcoActivityRecycleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7718986226991111866L;

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
