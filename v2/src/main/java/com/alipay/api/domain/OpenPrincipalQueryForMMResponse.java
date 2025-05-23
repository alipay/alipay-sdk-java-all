package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 妈妈查询商家详情信息
 *
 * @author auto create
 * @since 1.0, 2025-05-13 16:45:46
 */
public class OpenPrincipalQueryForMMResponse extends AlipayObject {

	private static final long serialVersionUID = 3582262286971521862L;

	/**
	 * 商家扩展信息
	 */
	@ApiField("extend_info")
	private AlimamaPrincipalExtendInfo extendInfo;

	/**
	 * 灯火一级类目id
	 */
	@ApiField("first_trade_id")
	private String firstTradeId;

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
	 * 商户号
	 */
	@ApiField("principal_oid")
	private String principalOid;

	/**
	 * 商家对外唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 灯火二级类目id
	 */
	@ApiField("second_trade_id")
	private String secondTradeId;

	/**
	 * 商家状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商家状态名称
	 */
	@ApiField("status_name")
	private String statusName;

	public AlimamaPrincipalExtendInfo getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(AlimamaPrincipalExtendInfo extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFirstTradeId() {
		return this.firstTradeId;
	}
	public void setFirstTradeId(String firstTradeId) {
		this.firstTradeId = firstTradeId;
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

	public String getPrincipalOid() {
		return this.principalOid;
	}
	public void setPrincipalOid(String principalOid) {
		this.principalOid = principalOid;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getSecondTradeId() {
		return this.secondTradeId;
	}
	public void setSecondTradeId(String secondTradeId) {
		this.secondTradeId = secondTradeId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
