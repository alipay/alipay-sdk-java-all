package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 储值卡充值的卡bin规则：查询
 *
 * @author auto create
 * @since 1.0, 2021-04-21 15:06:48
 */
public class AlipayMerchantPayforprivilegeCardbinactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2433981614498477495L;

	/**
	 * 卡bin规则的外部活动唯一编号，联合对应商家的pid作为唯一键
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
