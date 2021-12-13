package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 储值卡充值的卡bin规则：删除
 *
 * @author auto create
 * @since 1.0, 2021-04-16 16:19:51
 */
public class AlipayMerchantPayforprivilegeCardbinactivityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4253995126596456348L;

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
