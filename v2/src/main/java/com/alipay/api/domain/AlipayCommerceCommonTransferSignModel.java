package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户转账分佣授权签约
 *
 * @author auto create
 * @since 1.0, 2023-11-21 10:41:39
 */
public class AlipayCommerceCommonTransferSignModel extends AlipayObject {

	private static final long serialVersionUID = 4292646715292812879L;

	/**
	 * 用以表明此次签约的外部业务号，同业务号签约行为幂等
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
