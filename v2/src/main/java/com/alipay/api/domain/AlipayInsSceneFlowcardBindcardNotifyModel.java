package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量卡绑卡同步通知
 *
 * @author auto create
 * @since 1.0, 2026-09-15 18:04:01
 */
public class AlipayInsSceneFlowcardBindcardNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8454241484893781666L;

	/**
	 * 支付宝的服务记录编号
	 */
	@ApiField("ant_ser_apply_no")
	private String antSerApplyNo;

	/**
	 * 支付宝的服务合约编号
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	/**
	 * 用户绑卡时间
	 */
	@ApiField("bind_card_time")
	private Date bindCardTime;

	/**
	 * 用户绑定的实体卡ICCID
	 */
	@ApiField("iccid")
	private String iccid;

	/**
	 * 实体卡SIMNO
	 */
	@ApiField("sim_no")
	private String simNo;

	public String getAntSerApplyNo() {
		return this.antSerApplyNo;
	}
	public void setAntSerApplyNo(String antSerApplyNo) {
		this.antSerApplyNo = antSerApplyNo;
	}

	public String getAntSerContractNo() {
		return this.antSerContractNo;
	}
	public void setAntSerContractNo(String antSerContractNo) {
		this.antSerContractNo = antSerContractNo;
	}

	public Date getBindCardTime() {
		return this.bindCardTime;
	}
	public void setBindCardTime(Date bindCardTime) {
		this.bindCardTime = bindCardTime;
	}

	public String getIccid() {
		return this.iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getSimNo() {
		return this.simNo;
	}
	public void setSimNo(String simNo) {
		this.simNo = simNo;
	}

}
