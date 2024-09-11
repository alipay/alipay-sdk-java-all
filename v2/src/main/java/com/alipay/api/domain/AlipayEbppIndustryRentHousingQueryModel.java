package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金租房提取余额支付房租支付订单查询
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:26:10
 */
public class AlipayEbppIndustryRentHousingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1669674581481724652L;

	/**
	 * 租房平台账单业务号
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
