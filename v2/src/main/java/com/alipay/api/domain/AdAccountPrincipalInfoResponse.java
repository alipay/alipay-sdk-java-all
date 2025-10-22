package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家详情数据
 *
 * @author auto create
 * @since 1.0, 2025-07-22 10:22:01
 */
public class AdAccountPrincipalInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 4873342755134839924L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 商户号
	 */
	@ApiField("alipay_oid")
	private String alipayOid;

	/**
	 * 灯火一级类目id
	 */
	@ApiField("first_trade_id")
	private String firstTradeId;

	/**
	 * 灯火一级类目名称
	 */
	@ApiField("first_trade_name")
	private String firstTradeName;

	/**
	 * 添加时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 投放端商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 商家名称
	 */
	@ApiField("principal_name")
	private String principalName;

	/**
	 * 灯火二级类目id
	 */
	@ApiField("second_trade_id")
	private String secondTradeId;

	/**
	 * 灯火二级类目名称
	 */
	@ApiField("second_trade_name")
	private String secondTradeName;

	/**
	 * 商家状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 商家状态名称
	 */
	@ApiField("status_name")
	private String statusName;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipayOid() {
		return this.alipayOid;
	}
	public void setAlipayOid(String alipayOid) {
		this.alipayOid = alipayOid;
	}

	public String getFirstTradeId() {
		return this.firstTradeId;
	}
	public void setFirstTradeId(String firstTradeId) {
		this.firstTradeId = firstTradeId;
	}

	public String getFirstTradeName() {
		return this.firstTradeName;
	}
	public void setFirstTradeName(String firstTradeName) {
		this.firstTradeName = firstTradeName;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getSecondTradeId() {
		return this.secondTradeId;
	}
	public void setSecondTradeId(String secondTradeId) {
		this.secondTradeId = secondTradeId;
	}

	public String getSecondTradeName() {
		return this.secondTradeName;
	}
	public void setSecondTradeName(String secondTradeName) {
		this.secondTradeName = secondTradeName;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
