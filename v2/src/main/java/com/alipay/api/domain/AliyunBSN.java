package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已申请备案服务码
 *
 * @author auto create
 * @since 1.0, 2023-10-10 19:35:21
 */
public class AliyunBSN extends AlipayObject {

	private static final long serialVersionUID = 8131672428918464452L;

	/**
	 * 备案服务码分配时间
	 */
	@ApiField("assign_ts")
	private String assignTs;

	/**
	 * 备案号
	 */
	@ApiField("beian_num")
	private String beianNum;

	/**
	 * 备案服务码
	 */
	@ApiField("bsn")
	private String bsn;

	/**
	 * 备案服务码状态，
INIT-未分配，BOUND-已分配，RECORDED-已备案，EXPIRED-已失效，RECORDING-备案中
	 */
	@ApiField("status")
	private String status;

	public String getAssignTs() {
		return this.assignTs;
	}
	public void setAssignTs(String assignTs) {
		this.assignTs = assignTs;
	}

	public String getBeianNum() {
		return this.beianNum;
	}
	public void setBeianNum(String beianNum) {
		this.beianNum = beianNum;
	}

	public String getBsn() {
		return this.bsn;
	}
	public void setBsn(String bsn) {
		this.bsn = bsn;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
