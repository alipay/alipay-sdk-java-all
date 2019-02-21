package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验用户信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:05
 */
public class SsdataFindataOperatorUserinfoCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5392371148319767137L;

	/**
	 * 业务流水号，提交用户信息时系统返回
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用户运营商登录信息
	 */
	@ApiField("form_map")
	private LoginForm formMap;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public LoginForm getFormMap() {
		return this.formMap;
	}
	public void setFormMap(LoginForm formMap) {
		this.formMap = formMap;
	}

}
