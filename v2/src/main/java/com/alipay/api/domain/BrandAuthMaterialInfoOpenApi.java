package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌授权材料
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:42:43
 */
public class BrandAuthMaterialInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 2325552555331273688L;

	/**
	 * 授权级别
L1:一级授权
L2:二级授权
L3:三级授权
L4:四级及以上
	 */
	@ApiField("auth_level")
	private String authLevel;

	/**
	 * 是否属于个人
true：是个人，false：非个人

当传入brand_manage_type，且brand_manage_type=BRAND_AUTH时必选
	 */
	@ApiField("belong_person")
	private Boolean belongPerson;

	/**
	 * 品牌经营类型
PRIVATE_BRAND：自有品牌
BRAND_AUTH：品牌授权
DISTRIBUTE_AUTH：经销授权
	 */
	@ApiField("brand_manage_type")
	private String brandManageType;

	/**
	 * null
	 */
	@ApiListField("brand_relation_proof")
	@ApiField("brand_file_info_open_api")
	private List<BrandFileInfoOpenApi> brandRelationProof;

	/**
	 * null
	 */
	@ApiListField("id_card_file")
	@ApiField("brand_file_info_open_api")
	private List<BrandFileInfoOpenApi> idCardFile;

	/**
	 * null
	 */
	@ApiListField("passport")
	@ApiField("brand_file_info_open_api")
	private List<BrandFileInfoOpenApi> passport;

	/**
	 * 个人身份证明
ID_CARD：个人身份证
PASSPORT：个人护照

当传入brand_manage_type，且brand_manage_type=BRAND_AUTH时必选
	 */
	@ApiField("person_certification")
	private String personCertification;

	/**
	 * null
	 */
	@ApiListField("qualifications")
	@ApiField("brand_file_info_open_api")
	private List<BrandFileInfoOpenApi> qualifications;

	public String getAuthLevel() {
		return this.authLevel;
	}
	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}

	public Boolean getBelongPerson() {
		return this.belongPerson;
	}
	public void setBelongPerson(Boolean belongPerson) {
		this.belongPerson = belongPerson;
	}

	public String getBrandManageType() {
		return this.brandManageType;
	}
	public void setBrandManageType(String brandManageType) {
		this.brandManageType = brandManageType;
	}

	public List<BrandFileInfoOpenApi> getBrandRelationProof() {
		return this.brandRelationProof;
	}
	public void setBrandRelationProof(List<BrandFileInfoOpenApi> brandRelationProof) {
		this.brandRelationProof = brandRelationProof;
	}

	public List<BrandFileInfoOpenApi> getIdCardFile() {
		return this.idCardFile;
	}
	public void setIdCardFile(List<BrandFileInfoOpenApi> idCardFile) {
		this.idCardFile = idCardFile;
	}

	public List<BrandFileInfoOpenApi> getPassport() {
		return this.passport;
	}
	public void setPassport(List<BrandFileInfoOpenApi> passport) {
		this.passport = passport;
	}

	public String getPersonCertification() {
		return this.personCertification;
	}
	public void setPersonCertification(String personCertification) {
		this.personCertification = personCertification;
	}

	public List<BrandFileInfoOpenApi> getQualifications() {
		return this.qualifications;
	}
	public void setQualifications(List<BrandFileInfoOpenApi> qualifications) {
		this.qualifications = qualifications;
	}

}
