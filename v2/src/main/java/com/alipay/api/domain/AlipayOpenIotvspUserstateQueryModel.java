package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询机构人员核身库状态
 *
 * @author auto create
 * @since 1.0, 2024-05-21 10:57:50
 */
public class AlipayOpenIotvspUserstateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6291197743866487653L;

	/**
	 * ISV的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 机构编码
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 用户唯一编号
	 */
	@ApiField("vid")
	private String vid;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
