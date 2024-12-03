package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹注册设备验签
 *
 * @author auto create
 * @since 1.0, 2022-07-18 14:40:08
 */
public class AlipaySecurityProdFingerprintDeviceVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6277289356794192221L;

	/**
	 * IFAA协议的版本，目前为2.0;建议填写此字段，随着业务发展后面可能会强制要求传递;
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * ifaf_message:注册阶段客户端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含客户端的校验数据。
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单，用于核对与问题排查。原则上来说需要保持唯一性。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

	public String getIfafMessage() {
		return this.ifafMessage;
	}
	public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
