package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品查询维度选项
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProductVOOptions extends AlipayObject {

	private static final long serialVersionUID = 4573376863596131295L;

	/**
	 * 是否包括产品条件组信息，默认为false
	 */
	@ApiField("include_condition_group")
	private Boolean includeConditionGroup;

	/**
	 * 是否包括产品基本信息，默认为false
	 */
	@ApiField("include_prod_base")
	private Boolean includeProdBase;

	/**
	 * 是否包括产品参与者信息，默认为false
	 */
	@ApiField("include_prod_ip")
	private Boolean includeProdIp;

	/**
	 * 是否包括产品区域信息
	 */
	@ApiField("include_prod_lo")
	private Boolean includeProdLo;

	/**
	 * 是否包括产品外标信息
	 */
	@ApiField("include_prod_mark")
	private Boolean includeProdMark;

	/**
	 * 产品关联关系
	 */
	@ApiField("include_prod_rel")
	private String includeProdRel;

	/**
	 * 是否包括产品资源项信息
	 */
	@ApiField("include_prod_ri")
	private Boolean includeProdRi;

	public Boolean getIncludeConditionGroup() {
		return this.includeConditionGroup;
	}
	public void setIncludeConditionGroup(Boolean includeConditionGroup) {
		this.includeConditionGroup = includeConditionGroup;
	}

	public Boolean getIncludeProdBase() {
		return this.includeProdBase;
	}
	public void setIncludeProdBase(Boolean includeProdBase) {
		this.includeProdBase = includeProdBase;
	}

	public Boolean getIncludeProdIp() {
		return this.includeProdIp;
	}
	public void setIncludeProdIp(Boolean includeProdIp) {
		this.includeProdIp = includeProdIp;
	}

	public Boolean getIncludeProdLo() {
		return this.includeProdLo;
	}
	public void setIncludeProdLo(Boolean includeProdLo) {
		this.includeProdLo = includeProdLo;
	}

	public Boolean getIncludeProdMark() {
		return this.includeProdMark;
	}
	public void setIncludeProdMark(Boolean includeProdMark) {
		this.includeProdMark = includeProdMark;
	}

	public String getIncludeProdRel() {
		return this.includeProdRel;
	}
	public void setIncludeProdRel(String includeProdRel) {
		this.includeProdRel = includeProdRel;
	}

	public Boolean getIncludeProdRi() {
		return this.includeProdRi;
	}
	public void setIncludeProdRi(Boolean includeProdRi) {
		this.includeProdRi = includeProdRi;
	}

}
