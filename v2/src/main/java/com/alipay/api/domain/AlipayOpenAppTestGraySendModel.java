package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 页面 v3测试
 *
 * @author auto create
 * @since 1.0, 2023-04-10 17:24:49
 */
public class AlipayOpenAppTestGraySendModel extends AlipayObject {

	private static final long serialVersionUID = 8118777862156652585L;

	/**
	 * 1
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * 1
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 1
	 */
	@ApiField("tid")
	private String tid;

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTid() {
		return this.tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}

}
