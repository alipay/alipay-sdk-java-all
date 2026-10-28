package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据明细
 *
 * @author auto create
 * @since 1.0, 2026-10-28 11:07:58
 */
public class EpUboResult extends AlipayObject {

	private static final long serialVersionUID = 1118692944864797957L;

	/**
	 * 统一社会信用代码或者注册号
	 */
	@ApiField("crn")
	private String crn;

	/**
	 * 是否豁免识别
	 */
	@ApiField("is_exempt")
	private String isExempt;

	/**
	 * 是否正常经营
	 */
	@ApiField("is_normal_status")
	private String isNormalStatus;

	/**
	 * 主体是否透明度较高
	 */
	@ApiField("is_transp_high")
	private String isTranspHigh;

	/**
	 * 主体名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 监管口径主体类型
	 */
	@ApiField("org_type_oversee")
	private String orgTypeOversee;

	/**
	 * 法定登记主体类型
	 */
	@ApiField("standard_reg_type")
	private String standardRegType;

	/**
	 * null
	 */
	@ApiListField("ubo_list")
	@ApiField("ep_ubo_info")
	private List<EpUboInfo> uboList;

	public String getCrn() {
		return this.crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getIsExempt() {
		return this.isExempt;
	}
	public void setIsExempt(String isExempt) {
		this.isExempt = isExempt;
	}

	public String getIsNormalStatus() {
		return this.isNormalStatus;
	}
	public void setIsNormalStatus(String isNormalStatus) {
		this.isNormalStatus = isNormalStatus;
	}

	public String getIsTranspHigh() {
		return this.isTranspHigh;
	}
	public void setIsTranspHigh(String isTranspHigh) {
		this.isTranspHigh = isTranspHigh;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgTypeOversee() {
		return this.orgTypeOversee;
	}
	public void setOrgTypeOversee(String orgTypeOversee) {
		this.orgTypeOversee = orgTypeOversee;
	}

	public String getStandardRegType() {
		return this.standardRegType;
	}
	public void setStandardRegType(String standardRegType) {
		this.standardRegType = standardRegType;
	}

	public List<EpUboInfo> getUboList() {
		return this.uboList;
	}
	public void setUboList(List<EpUboInfo> uboList) {
		this.uboList = uboList;
	}

}
