package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交小程序品牌认证
 *
 * @author auto create
 * @since 1.0, 2020-10-21 11:44:15
 */
public class AlipayOpenMiniMiniappBrandSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5544276787813185589L;

	/**
	 * 申请的资质类型
SELF_BRAND_APPLY 自有品牌申请(当需要一个新的品牌时选择此项)
AUTHORIZE_BRAND_APPLY 授权品牌申请(当需要授权一个已有的品牌给商户时选择此项)
EXIST_BRAND_BIND 品牌绑定，适用于品牌已申请成功的情况(当需要将已有品牌绑定到无品牌小程序时选择此项)
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 授权资质相关信息(只有申请的资质类型为AUTHORIZE_BRAND_APPLY时需要填写)
	 */
	@ApiField("authorize_info")
	private AuthorizeInfo authorizeInfo;

	/**
	 * 商户已有品牌Id(只有申请的资质类型为EXIST_BRAND_BIND 时需要填写)
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌相关信息(只有申请的资质类型为AUTHORIZE_BRAND_APPLY或SELF_BRAND_APPLY时需要填写)
	 */
	@ApiField("brand_registration_info")
	private BrandRegistrationInfo brandRegistrationInfo;

	/**
	 * 申请人身份证明材料(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片，可以上传多个身份证明材料)
	 */
	@ApiListField("id_materials")
	@ApiField("string")
	private List<String> idMaterials;

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public AuthorizeInfo getAuthorizeInfo() {
		return this.authorizeInfo;
	}
	public void setAuthorizeInfo(AuthorizeInfo authorizeInfo) {
		this.authorizeInfo = authorizeInfo;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public BrandRegistrationInfo getBrandRegistrationInfo() {
		return this.brandRegistrationInfo;
	}
	public void setBrandRegistrationInfo(BrandRegistrationInfo brandRegistrationInfo) {
		this.brandRegistrationInfo = brandRegistrationInfo;
	}

	public List<String> getIdMaterials() {
		return this.idMaterials;
	}
	public void setIdMaterials(List<String> idMaterials) {
		this.idMaterials = idMaterials;
	}

}
