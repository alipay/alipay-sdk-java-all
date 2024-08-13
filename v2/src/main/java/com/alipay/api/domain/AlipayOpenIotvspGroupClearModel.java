package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人员库清理接口
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:13:58
 */
public class AlipayOpenIotvspGroupClearModel extends AlipayObject {

	private static final long serialVersionUID = 2182745141511887666L;

	/**
	 * 业务id，由调用方生成的唯一业务流水，原则上不可重复
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 机构外标
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

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

}
