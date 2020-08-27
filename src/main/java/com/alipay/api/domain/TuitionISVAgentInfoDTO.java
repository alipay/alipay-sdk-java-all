package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv机构信息
 *
 * @author auto create
 * @since 1.0, 2020-05-26 16:10:18
 */
public class TuitionISVAgentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7486746554476675475L;

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
