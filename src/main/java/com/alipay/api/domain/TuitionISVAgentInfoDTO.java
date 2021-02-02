package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv机构信息
 *
 * @author auto create
 * @since 1.0, 2020-11-30 14:06:47
 */
public class TuitionISVAgentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4778728836552794259L;

	/**
	 * 机构isv机构pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * isv机构sub pid
	 */
	@ApiField("sub_pid")
	private String subPid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSubPid() {
		return this.subPid;
	}
	public void setSubPid(String subPid) {
		this.subPid = subPid;
	}

}
