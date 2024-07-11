package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端权限检测报告-隐私API调用点位 DTO
 *
 * @author auto create
 * @since 1.0, 2023-06-27 17:18:16
 */
public class ApmobileAppUsedApiDTO extends AlipayObject {

	private static final long serialVersionUID = 5576288196682829274L;

	/**
	 * 隐私api描述
	 */
	@ApiField("api_desc")
	private String apiDesc;

	/**
	 * bundle信息
	 */
	@ApiField("bundle")
	private String bundle;

	/**
	 * 方法信息
	 */
	@ApiField("method_info")
	private String methodInfo;

	/**
	 * 位置
	 */
	@ApiField("stmt")
	private String stmt;

	public String getApiDesc() {
		return this.apiDesc;
	}
	public void setApiDesc(String apiDesc) {
		this.apiDesc = apiDesc;
	}

	public String getBundle() {
		return this.bundle;
	}
	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	public String getMethodInfo() {
		return this.methodInfo;
	}
	public void setMethodInfo(String methodInfo) {
		this.methodInfo = methodInfo;
	}

	public String getStmt() {
		return this.stmt;
	}
	public void setStmt(String stmt) {
		this.stmt = stmt;
	}

}
