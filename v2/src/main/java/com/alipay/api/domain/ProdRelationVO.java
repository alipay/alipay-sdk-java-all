package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品间关系
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ProdRelationVO extends AlipayObject {

	private static final long serialVersionUID = 5158514722898182897L;

	/**
	 * 数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 数量类型
	 */
	@ApiField("num_type")
	private String numType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 关联的产品编码
	 */
	@ApiField("prod_rel_code")
	private String prodRelCode;

	/**
	 * 关联的产品名称
	 */
	@ApiField("prod_rel_name")
	private String prodRelName;

	/**
	 * 产品关联类型
	 */
	@ApiField("prod_rel_type")
	private String prodRelType;

	/**
	 * 关联的产品版本
	 */
	@ApiField("prod_rel_version")
	private String prodRelVersion;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 产品关联子类型
	 */
	@ApiField("sub_prod_rel_type")
	private String subProdRelType;

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getNumType() {
		return this.numType;
	}
	public void setNumType(String numType) {
		this.numType = numType;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdRelCode() {
		return this.prodRelCode;
	}
	public void setProdRelCode(String prodRelCode) {
		this.prodRelCode = prodRelCode;
	}

	public String getProdRelName() {
		return this.prodRelName;
	}
	public void setProdRelName(String prodRelName) {
		this.prodRelName = prodRelName;
	}

	public String getProdRelType() {
		return this.prodRelType;
	}
	public void setProdRelType(String prodRelType) {
		this.prodRelType = prodRelType;
	}

	public String getProdRelVersion() {
		return this.prodRelVersion;
	}
	public void setProdRelVersion(String prodRelVersion) {
		this.prodRelVersion = prodRelVersion;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getSubProdRelType() {
		return this.subProdRelType;
	}
	public void setSubProdRelType(String subProdRelType) {
		this.subProdRelType = subProdRelType;
	}

}
