package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过映射ID去查询会员信息
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:10:28
 */
public class AnttechBlockchainDefinCustomerMappedidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3891829546787442225L;

	/**
	 * DCHAIN("DCHAIN","供应链信用流转平台"),
ABS("ABS","ABS资产流转平台"),
BAMBOO("BAMBOO","BAMBOO项目"),
LOGISTICS_FIN("LOGISTICS_FIN", "物流金融"),
TRUSPLE("TRUSPLE", "跨境贸易金融平台");
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * ALIID("ALI_ID","AliID"),
ICBU_ACCT_ID("ICBU_ACCT_ID","ICBU_ACCT_ID"),
HAVANAL("HAVANAL_ID","HavanaID"),
DID("DID","DID"),
LEI_ID("LEI_ID","LEI_ID"),
OCID("ONE_COMPANY_ID", "ONE_COMPANY_ID"),
IP_ID("IP_ID", "网商银行会员IP_ID"),
IP_ROLE_ID("IP_ROLE_ID", "网商银行会员IP_ROLE_ID"),
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * ID的值
	 */
	@ApiField("id_value")
	private String idValue;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdValue() {
		return this.idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

}
