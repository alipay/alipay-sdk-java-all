package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益明细信息
 *
 * @author auto create
 * @since 1.0, 2025-10-28 11:00:41
 */
public class HmEquityInfo extends AlipayObject {

	private static final long serialVersionUID = 7253563132983171174L;

	/**
	 * 是否激活
	 */
	@ApiField("activated")
	private Boolean activated;

	/**
	 * 权益包下的基础权益
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * 权益包下的基础权益名称
	 */
	@ApiField("equity_name")
	private String equityName;

	/**
	 * 权益的计费类型
	 */
	@ApiField("equity_type")
	private String equityType;

	/**
	 * 总额度-已使用额度，初始化=总额度，如果是金额：单位（分），如果是次数：单位（次）...
	 */
	@ApiField("residue_quota")
	private String residueQuota;

	/**
	 * 权益包中配置的权益额度，如果是金额：单位（分），如果是次数：单位（次）...
	 */
	@ApiField("total_quota")
	private String totalQuota;

	/**
	 * 有效期结束时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("valid_date")
	private String validDate;

	public Boolean getActivated() {
		return this.activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public String getEquityCode() {
		return this.equityCode;
	}
	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

	public String getEquityName() {
		return this.equityName;
	}
	public void setEquityName(String equityName) {
		this.equityName = equityName;
	}

	public String getEquityType() {
		return this.equityType;
	}
	public void setEquityType(String equityType) {
		this.equityType = equityType;
	}

	public String getResidueQuota() {
		return this.residueQuota;
	}
	public void setResidueQuota(String residueQuota) {
		this.residueQuota = residueQuota;
	}

	public String getTotalQuota() {
		return this.totalQuota;
	}
	public void setTotalQuota(String totalQuota) {
		this.totalQuota = totalQuota;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
