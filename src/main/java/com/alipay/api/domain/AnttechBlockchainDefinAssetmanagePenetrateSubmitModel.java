package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产穿透服务业务提交
 *
 * @author auto create
 * @since 1.0, 2020-06-28 11:13:52
 */
public class AnttechBlockchainDefinAssetmanagePenetrateSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1638246471151721328L;

	/**
	 * 具体提交功能所需的业务数据JSON
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 业务提交所需使用的接口功能
	 */
	@ApiField("function")
	private String function;

	/**
	 * 系统幂等请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}

	public String getFunction() {
		return this.function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
