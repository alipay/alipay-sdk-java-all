package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-26 11:02:51
 */
public class ReassignNumberResult extends AlipayObject {

	private static final long serialVersionUID = 5231997143841756788L;

	/**
	 * 根据入参返回查询到的商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 是否疑似二次放号，true=疑似二次放号，false=非疑似
	 */
	@ApiField("reassign_suspected")
	private Boolean reassignSuspected;

	/**
	 * 非疑似时为空，疑似时二次放号的返回时间格式
	 */
	@ApiField("reassign_time")
	private String reassignTime;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public Boolean getReassignSuspected() {
		return this.reassignSuspected;
	}
	public void setReassignSuspected(Boolean reassignSuspected) {
		this.reassignSuspected = reassignSuspected;
	}

	public String getReassignTime() {
		return this.reassignTime;
	}
	public void setReassignTime(String reassignTime) {
		this.reassignTime = reassignTime;
	}

}
