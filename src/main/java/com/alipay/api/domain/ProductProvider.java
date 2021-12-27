package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值产品提供商
 *
 * @author auto create
 * @since 1.0, 2013-12-17 15:37:31
 */
public class ProductProvider extends AlipayObject {

	private static final long serialVersionUID = 5176811786414579456L;

	/**
	 * 卡代英文名称 备注:淘宝交易为空
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 卡代中文名称 备注：淘宝交易为空
	 */
	@ApiField("agency_name")
	private String agencyName;

	/**
	 * 业务 类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 充值产品主表ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 子运营商英文名称 备注:淘宝交易为空
	 */
	@ApiField("sub_operator")
	private String subOperator;

	/**
	 * 子运营商中文名称 ,如浙江移动
	 */
	@ApiField("sub_operator_name")
	private String subOperatorName;

	public String getAgency() {
		return this.agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getAgencyName() {
		return this.agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getSubOperator() {
		return this.subOperator;
	}
	public void setSubOperator(String subOperator) {
		this.subOperator = subOperator;
	}

	public String getSubOperatorName() {
		return this.subOperatorName;
	}
	public void setSubOperatorName(String subOperatorName) {
		this.subOperatorName = subOperatorName;
	}

}
