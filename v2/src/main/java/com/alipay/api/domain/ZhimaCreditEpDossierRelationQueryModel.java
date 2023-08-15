package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻企业信用企业关联关系查询
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:38:35
 */
public class ZhimaCreditEpDossierRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1478585775199279165L;

	/**
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业关联关系子产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 关联关系类型列表
	 */
	@ApiListField("relation_code_list")
	@ApiField("string")
	private List<String> relationCodeList;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getRelationCodeList() {
		return this.relationCodeList;
	}
	public void setRelationCodeList(List<String> relationCodeList) {
		this.relationCodeList = relationCodeList;
	}

}
