package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约基本属性信息
 *
 * @author auto create
 * @since 1.0, 2018-07-27 16:22:03
 */
public class ContractBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 8694823315547594873L;

	/**
	 * 合约简要描述
	 */
	@ApiField("brief_desc")
	private String briefDesc;

	/**
	 * 合约中文名
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合约过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 最后守约时间
	 */
	@ApiField("last_promise_date")
	private Date lastPromiseDate;

	/**
	 * 用户在输入场景下签约合同的序号
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 合约签署时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 合同签约应用app标识
	 */
	@ApiField("source")
	private String source;

	/**
	 * 合同状态，可选值：success, fail
	 */
	@ApiField("status")
	private String status;

	public String getBriefDesc() {
		return this.briefDesc;
	}
	public void setBriefDesc(String briefDesc) {
		this.briefDesc = briefDesc;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Date getLastPromiseDate() {
		return this.lastPromiseDate;
	}
	public void setLastPromiseDate(Date lastPromiseDate) {
		this.lastPromiseDate = lastPromiseDate;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
