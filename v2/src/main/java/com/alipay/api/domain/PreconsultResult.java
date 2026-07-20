package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:30:12
 */
public class PreconsultResult extends AlipayObject {

	private static final long serialVersionUID = 8526394338352935932L;

	/**
	 * 渠道列表
	 */
	@ApiField("channel_list")
	private ConsultChannelResponse channelList;

	/**
	 * 机构PID
	 */
	@ApiField("inst_pid")
	private String instPid;

	/**
	 * 是否预鉴权通过
	 */
	@ApiField("pass")
	private Boolean pass;

	/**
	 * 拒绝列表
	 */
	@ApiField("refuse_list")
	private ConsultRefuseResponse refuseList;

	public ConsultChannelResponse getChannelList() {
		return this.channelList;
	}
	public void setChannelList(ConsultChannelResponse channelList) {
		this.channelList = channelList;
	}

	public String getInstPid() {
		return this.instPid;
	}
	public void setInstPid(String instPid) {
		this.instPid = instPid;
	}

	public Boolean getPass() {
		return this.pass;
	}
	public void setPass(Boolean pass) {
		this.pass = pass;
	}

	public ConsultRefuseResponse getRefuseList() {
		return this.refuseList;
	}
	public void setRefuseList(ConsultRefuseResponse refuseList) {
		this.refuseList = refuseList;
	}

}
