package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商机作业详情查询
 *
 * @author auto create
 * @since 1.0, 2024-08-21 17:47:38
 */
public class AlipayOpenSpOpporDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2728743285548369615L;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商机作业Id
	 */
	@ApiField("oppor_id")
	private String opporId;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOpporId() {
		return this.opporId;
	}
	public void setOpporId(String opporId) {
		this.opporId = opporId;
	}

}
