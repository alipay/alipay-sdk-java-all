package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备申请物流节点详细信息
 *
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:16
 */
public class DeviceApplyExpressDetail extends AlipayObject {

	private static final long serialVersionUID = 3698914596897472713L;

	/**
	 * 物流节点发生的时间
	 */
	@ApiField("express_time")
	private String expressTime;

	/**
	 * 快递编号
	 */
	@ApiField("mail_no")
	private String mailNo;

	/**
	 * 物流节点信息
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 物流节点状态
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getExpressTime() {
		return this.expressTime;
	}
	public void setExpressTime(String expressTime) {
		this.expressTime = expressTime;
	}

	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public String getStandardDesc() {
		return this.standardDesc;
	}
	public void setStandardDesc(String standardDesc) {
		this.standardDesc = standardDesc;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
