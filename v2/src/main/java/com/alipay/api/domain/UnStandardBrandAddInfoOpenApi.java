package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 非标品牌信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class UnStandardBrandAddInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 6687812481661346133L;

	/**
	 * UN_STANDARD_E-COMMERCE：电商非标
LOCAL_LIFE：本地生活
CONTENT：内容
GOV_MET：政务民生
PLATFORM：平台
OTHER：其他
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * null
	 */
	@ApiListField("brand_category")
	@ApiField("string")
	private List<String> brandCategory;

	/**
	 * 对应brandCategory的类目名称
	 */
	@ApiField("brand_category_name")
	private String brandCategoryName;

	/**
	 * null
	 */
	@ApiListField("certification_files")
	@ApiField("brand_file_info_open_api")
	private List<BrandFileInfoOpenApi> certificationFiles;

	/**
	 * REGISTRATION_CERTIFICATE：注册备案证书
ENTERPRISE_NAME：企业商号
DOOR_PITCHING：门头店招
GEOGRAPHIC_INDICATIONS：地理标志
OTHER：其他
	 */
	@ApiField("certification_type")
	private String certificationType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<String> getBrandCategory() {
		return this.brandCategory;
	}
	public void setBrandCategory(List<String> brandCategory) {
		this.brandCategory = brandCategory;
	}

	public String getBrandCategoryName() {
		return this.brandCategoryName;
	}
	public void setBrandCategoryName(String brandCategoryName) {
		this.brandCategoryName = brandCategoryName;
	}

	public List<BrandFileInfoOpenApi> getCertificationFiles() {
		return this.certificationFiles;
	}
	public void setCertificationFiles(List<BrandFileInfoOpenApi> certificationFiles) {
		this.certificationFiles = certificationFiles;
	}

	public String getCertificationType() {
		return this.certificationType;
	}
	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}

}
