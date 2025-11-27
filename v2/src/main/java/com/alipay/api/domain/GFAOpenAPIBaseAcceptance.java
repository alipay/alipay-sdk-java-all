package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理单基础模型
 *
 * @author auto create
 * @since 1.0, 2020-08-27 20:00:22
 */
public class GFAOpenAPIBaseAcceptance extends AlipayObject {

	private static final long serialVersionUID = 2551984154536246352L;

	/**
	 * 业财受理单号
	 */
	@ApiField("acceptance_id")
	private String acceptanceId;

	/**
	 * 业务事件码
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 端事件码
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端产品码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

	/**
	 * 受理方向
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 业财统一身份Id
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 业务流水号
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 主体Id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 受理单扩展信息
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 逆向受理关联的业务流水号
	 */
	@ApiField("rel_out_business_no")
	private String relOutBusinessNo;

	/**
	 * 逆向受理关联的业务流水子单号
	 */
	@ApiField("rel_sub_out_business_no")
	private String relSubOutBusinessNo;

	/**
	 * 业务唯一标识
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 解决方案id
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 业务流水子单号
	 */
	@ApiField("sub_out_business_no")
	private String subOutBusinessNo;

	/**
	 * 受理来源系统
	 */
	@ApiField("system_origin")
	private String systemOrigin;

	public String getAcceptanceId() {
		return this.acceptanceId;
	}
	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getRelOutBusinessNo() {
		return this.relOutBusinessNo;
	}
	public void setRelOutBusinessNo(String relOutBusinessNo) {
		this.relOutBusinessNo = relOutBusinessNo;
	}

	public String getRelSubOutBusinessNo() {
		return this.relSubOutBusinessNo;
	}
	public void setRelSubOutBusinessNo(String relSubOutBusinessNo) {
		this.relSubOutBusinessNo = relSubOutBusinessNo;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getSubOutBusinessNo() {
		return this.subOutBusinessNo;
	}
	public void setSubOutBusinessNo(String subOutBusinessNo) {
		this.subOutBusinessNo = subOutBusinessNo;
	}

	public String getSystemOrigin() {
		return this.systemOrigin;
	}
	public void setSystemOrigin(String systemOrigin) {
		this.systemOrigin = systemOrigin;
	}

}
