package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 事件下指定action类型通知
 *
 * @author auto create
 * @since 1.0, 2020-12-14 17:35:36
 */
public class AlipaySecurityProdEventActionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3131446645872822531L;

	/**
	 * 返回描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 调用风洞唯一标识
	 */
	@ApiField("socplt_key")
	private String socpltKey;

	/**
	 * action处置状态
	 */
	@ApiField("status")
	private String status;

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSocpltKey() {
		return this.socpltKey;
	}
	public void setSocpltKey(String socpltKey) {
		this.socpltKey = socpltKey;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
