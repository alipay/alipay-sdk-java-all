package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OB合同信息
 *
 * @author auto create
 * @since 1.0, 2024-01-02 19:45:02
 */
public class OBContractDTO extends AlipayObject {

	private static final long serialVersionUID = 2691416483563928288L;

	/**
	 * bid
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 生效时间
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商机编码
	 */
	@ApiField("lead_no")
	private String leadNo;

	/**
	 * 维保结束时间
	 */
	@ApiField("ma_end_time")
	private Date maEndTime;

	/**
	 * 维保开始时间
	 */
	@ApiField("ma_start_time")
	private Date maStartTime;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLeadNo() {
		return this.leadNo;
	}
	public void setLeadNo(String leadNo) {
		this.leadNo = leadNo;
	}

	public Date getMaEndTime() {
		return this.maEndTime;
	}
	public void setMaEndTime(Date maEndTime) {
		this.maEndTime = maEndTime;
	}

	public Date getMaStartTime() {
		return this.maStartTime;
	}
	public void setMaStartTime(Date maStartTime) {
		this.maStartTime = maStartTime;
	}

}
