package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员特权领取记录查询
 *
 * @author auto create
 * @since 1.0, 2026-02-03 19:41:41
 */
public class AlipayUserPrivilegerecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7792177157321867325L;

	/**
	 * 业务流水号
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
