package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产穿透服务业务查询
 *
 * @author auto create
 * @since 1.0, 2024-05-16 17:23:46
 */
public class AnttechBlockchainDefinAssetmanagePenetrateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8559949783466391115L;

	/**
	 * 具体查询功能所需的业务数据JSON
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 业务查询所需使用的接口功能
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
