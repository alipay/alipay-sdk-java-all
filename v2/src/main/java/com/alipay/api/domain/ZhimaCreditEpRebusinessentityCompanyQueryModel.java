package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人企店综合查询服_企业信息入参版
 *
 * @author auto create
 * @since 1.0, 2024-12-23 15:10:19
 */
public class ZhimaCreditEpRebusinessentityCompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4462963193416452383L;

	/**
	 * 企业查询key：企业社会统一信用代码，企业注册号，企业名称可任选一个入参
	 */
	@ApiField("company_key")
	private String companyKey;

	/**
	 * 店铺平台列表（该字段不传，默认所有店铺平台）
	 */
	@ApiListField("platform_id_list")
	@ApiField("string")
	private List<String> platformIdList;

	/**
	 * 店铺平台类型列表（该字段不传，默认所有店铺平台类型）
	 */
	@ApiListField("platform_type_list")
	@ApiField("string")
	private List<String> platformTypeList;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 关系类型列表
	 */
	@ApiListField("rel_type_code_list")
	@ApiField("string")
	private List<String> relTypeCodeList;

	public String getCompanyKey() {
		return this.companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public List<String> getPlatformIdList() {
		return this.platformIdList;
	}
	public void setPlatformIdList(List<String> platformIdList) {
		this.platformIdList = platformIdList;
	}

	public List<String> getPlatformTypeList() {
		return this.platformTypeList;
	}
	public void setPlatformTypeList(List<String> platformTypeList) {
		this.platformTypeList = platformTypeList;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getRelTypeCodeList() {
		return this.relTypeCodeList;
	}
	public void setRelTypeCodeList(List<String> relTypeCodeList) {
		this.relTypeCodeList = relTypeCodeList;
	}

}
