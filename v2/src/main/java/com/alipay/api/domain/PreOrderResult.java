package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单预创建结果
 *
 * @author auto create
 * @since 1.0, 2022-02-15 17:02:44
 */
public class PreOrderResult extends AlipayObject {

	private static final long serialVersionUID = 5593661341176738339L;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 错误描述
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 校验是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
