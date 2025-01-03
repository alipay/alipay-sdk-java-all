package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝直连商户进件结果查询
 *
 * @author auto create
 * @since 1.0, 2024-12-25 19:48:17
 */
public class AntMerchantExpandDirectAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4529723572477637157L;

	/**
	 * 服务商侧申请单号ID，由服务商在进件时传入
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
