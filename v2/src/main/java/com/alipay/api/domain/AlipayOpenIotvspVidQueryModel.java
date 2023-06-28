package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过uid查询vid信息
 *
 * @author auto create
 * @since 1.0, 2023-04-11 14:59:15
 */
public class AlipayOpenIotvspVidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1146395756887534253L;

	/**
	 * 商家的id
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 用户的openId，uid和open_id至少传一个
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构外标
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 支付宝账号的id，uid和open_id至少传一个
	 */
	@ApiField("uid")
	private String uid;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
