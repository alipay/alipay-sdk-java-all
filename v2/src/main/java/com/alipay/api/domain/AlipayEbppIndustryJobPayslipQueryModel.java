package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业工资条信息兑换
 *
 * @author auto create
 * @since 1.0, 2024-12-18 17:19:55
 */
public class AlipayEbppIndustryJobPayslipQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1878672242212971549L;

	/**
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
