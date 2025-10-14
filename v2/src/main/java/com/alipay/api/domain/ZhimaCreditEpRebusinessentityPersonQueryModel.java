package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人企店综合查询服务_法人信息入参版
 *
 * @author auto create
 * @since 1.0, 2025-09-17 10:29:52
 */
public class ZhimaCreditEpRebusinessentityPersonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3712481786286217519L;

	/**
	 * 法人证件号
	 */
	@ApiField("person_cert_no")
	private String personCertNo;

	/**
	 * 法人证件号md5值
	 */
	@ApiField("person_cert_no_md_5")
	private String personCertNoMd5;

	/**
	 * 法人证件号（身份证号含护照等其他证件）SHA256加密的密文
	 */
	@ApiField("person_cert_no_sha_256")
	private String personCertNoSha256;

	/**
	 * 法人姓名
	 */
	@ApiField("person_name")
	private String personName;

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

	/**
	 * 企业18位统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getPersonCertNo() {
		return this.personCertNo;
	}
	public void setPersonCertNo(String personCertNo) {
		this.personCertNo = personCertNo;
	}

	public String getPersonCertNoMd5() {
		return this.personCertNoMd5;
	}
	public void setPersonCertNoMd5(String personCertNoMd5) {
		this.personCertNoMd5 = personCertNoMd5;
	}

	public String getPersonCertNoSha256() {
		return this.personCertNoSha256;
	}
	public void setPersonCertNoSha256(String personCertNoSha256) {
		this.personCertNoSha256 = personCertNoSha256;
	}

	public String getPersonName() {
		return this.personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
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

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
