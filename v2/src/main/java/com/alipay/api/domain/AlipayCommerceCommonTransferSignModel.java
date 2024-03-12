package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户转账分佣授权签约
 *
 * @author auto create
 * @since 1.0, 2023-12-05 14:25:15
 */
public class AlipayCommerceCommonTransferSignModel extends AlipayObject {

	private static final long serialVersionUID = 2248557983378694178L;

	/**
	 * 用以表明此次签约的外部业务号，同业务号签约行为幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务商代运营商户pid
	 */
	@ApiField("sign_pid")
	private String signPid;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSignPid() {
		return this.signPid;
	}
	public void setSignPid(String signPid) {
		this.signPid = signPid;
	}

}
