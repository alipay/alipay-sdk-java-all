package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:20:58
 */
public class OrgOperationalAggregateItem extends AlipayObject {

	private static final long serialVersionUID = 4723119912773411581L;

	/**
	 * 问答UV
	 */
	@ApiField("chat_uv")
	private Long chatUv;

	/**
	 * 数据日期
	 */
	@ApiField("data_dt")
	private String dataDt;

	/**
	 * 互动UV
	 */
	@ApiField("inter_uv")
	private Long interUv;

	/**
	 * 机构ID
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 门诊渗透率
	 */
	@ApiField("outpatient_penetration_rate")
	private String outpatientPenetrationRate;

	/**
	 * 门诊量
	 */
	@ApiField("outpatient_pv")
	private Long outpatientPv;

	/**
	 * 服务点击UV
	 */
	@ApiField("service_clk_uv")
	private Long serviceClkUv;

	/**
	 * 服务曝光UV
	 */
	@ApiField("service_expo_uv")
	private Long serviceExpoUv;

	/**
	 * 服务点击UVCTR
	 */
	@ApiField("service_uv_ctr")
	private String serviceUvCtr;

	public Long getChatUv() {
		return this.chatUv;
	}
	public void setChatUv(Long chatUv) {
		this.chatUv = chatUv;
	}

	public String getDataDt() {
		return this.dataDt;
	}
	public void setDataDt(String dataDt) {
		this.dataDt = dataDt;
	}

	public Long getInterUv() {
		return this.interUv;
	}
	public void setInterUv(Long interUv) {
		this.interUv = interUv;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOutpatientPenetrationRate() {
		return this.outpatientPenetrationRate;
	}
	public void setOutpatientPenetrationRate(String outpatientPenetrationRate) {
		this.outpatientPenetrationRate = outpatientPenetrationRate;
	}

	public Long getOutpatientPv() {
		return this.outpatientPv;
	}
	public void setOutpatientPv(Long outpatientPv) {
		this.outpatientPv = outpatientPv;
	}

	public Long getServiceClkUv() {
		return this.serviceClkUv;
	}
	public void setServiceClkUv(Long serviceClkUv) {
		this.serviceClkUv = serviceClkUv;
	}

	public Long getServiceExpoUv() {
		return this.serviceExpoUv;
	}
	public void setServiceExpoUv(Long serviceExpoUv) {
		this.serviceExpoUv = serviceExpoUv;
	}

	public String getServiceUvCtr() {
		return this.serviceUvCtr;
	}
	public void setServiceUvCtr(String serviceUvCtr) {
		this.serviceUvCtr = serviceUvCtr;
	}

}
