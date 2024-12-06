package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品基本信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProductBaseVO extends AlipayObject {

	private static final long serialVersionUID = 1225697619214334426L;

	/**
	 * 产品业务状态,产品中心目前暂时不消费该业务状态，由外围业务消费
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 是否是组合产品,默认为false,填02
	 */
	@ApiField("is_combinate")
	private String isCombinate;

	/**
	 * 产品环境类型，默认是线上
	 */
	@ApiField("prod_env")
	private String prodEnv;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品模板编码
	 */
	@ApiField("prod_template_code")
	private String prodTemplateCode;

	/**
	 * 产品模板版本
	 */
	@ApiField("prod_template_version")
	private String prodTemplateVersion;

	/**
	 * 产品类型 :01: 普通产品；02：标准产品
	 */
	@ApiField("prod_type")
	private String prodType;

	/**
	 * 产品编码
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品管理状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 标准产品编码
	 */
	@ApiField("std_prod_code")
	private String stdProdCode;

	/**
	 * 标准产品版本
	 */
	@ApiField("std_prod_version")
	private String stdProdVersion;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getIsCombinate() {
		return this.isCombinate;
	}
	public void setIsCombinate(String isCombinate) {
		this.isCombinate = isCombinate;
	}

	public String getProdEnv() {
		return this.prodEnv;
	}
	public void setProdEnv(String prodEnv) {
		this.prodEnv = prodEnv;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdTemplateCode() {
		return this.prodTemplateCode;
	}
	public void setProdTemplateCode(String prodTemplateCode) {
		this.prodTemplateCode = prodTemplateCode;
	}

	public String getProdTemplateVersion() {
		return this.prodTemplateVersion;
	}
	public void setProdTemplateVersion(String prodTemplateVersion) {
		this.prodTemplateVersion = prodTemplateVersion;
	}

	public String getProdType() {
		return this.prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStdProdCode() {
		return this.stdProdCode;
	}
	public void setStdProdCode(String stdProdCode) {
		this.stdProdCode = stdProdCode;
	}

	public String getStdProdVersion() {
		return this.stdProdVersion;
	}
	public void setStdProdVersion(String stdProdVersion) {
		this.stdProdVersion = stdProdVersion;
	}

}
