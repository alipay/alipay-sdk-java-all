package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * api调用具体详情
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:53:51
 */
public class ApmobileApiDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1698949694968214533L;

	/**
	 * api描述
	 */
	@ApiField("api_desc")
	private String apiDesc;

	/**
	 * bundle信息
	 */
	@ApiField("bundle")
	private String bundle;

	/**
	 * 信息名称
	 */
	@ApiField("info_name")
	private String infoName;

	/**
	 * 信息类型
	 */
	@ApiField("info_type")
	private String infoType;

	/**
	 * 具体调用方法
	 */
	@ApiField("method_info")
	private String methodInfo;

	/**
	 * 涉及到的权限信息，&代表且的关系，|代表或的关系
	 */
	@ApiField("permissions")
	private String permissions;

	/**
	 * 调用位置
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

	public String getInfoName() {
		return this.infoName;
	}
	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	public String getInfoType() {
		return this.infoType;
	}
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	public String getMethodInfo() {
		return this.methodInfo;
	}
	public void setMethodInfo(String methodInfo) {
		this.methodInfo = methodInfo;
	}

	public String getPermissions() {
		return this.permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public String getStmt() {
		return this.stmt;
	}
	public void setStmt(String stmt) {
		this.stmt = stmt;
	}

}
