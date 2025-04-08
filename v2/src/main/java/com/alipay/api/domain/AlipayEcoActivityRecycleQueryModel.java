package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林能量查询
 *
 * @author auto create
 * @since 1.0, 2024-01-09 10:51:55
 */
public class AlipayEcoActivityRecycleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8818226356437238468L;

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
