package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝直连商户进件结果查询
 *
 * @author auto create
 * @since 1.0, 2025-01-09 09:48:51
 */
public class AntMerchantExpandDirectAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4759323359449339279L;

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
