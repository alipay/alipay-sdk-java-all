package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户关联isv信息
 *
 * @author auto create
 * @since 1.0, 2019-08-13 12:56:31
 */
public class IndirectIsvInfo extends AlipayObject {

	private static final long serialVersionUID = 6497963481942124396L;

	/**
	 * 是否绑定间连天梭
true表示绑定
false表示未绑定
	 */
	@ApiField("is_ts_binding")
	private String isTsBinding;

	/**
	 * 间连商户服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 间连商户服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	public String getIsTsBinding() {
		return this.isTsBinding;
	}
	public void setIsTsBinding(String isTsBinding) {
		this.isTsBinding = isTsBinding;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

}
