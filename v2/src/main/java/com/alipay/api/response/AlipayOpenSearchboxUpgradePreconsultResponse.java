package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AccessCheckInfo;
import com.alipay.api.domain.BrandCertInfo;
import com.alipay.api.domain.SearchBoxAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.searchbox.upgrade.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:23
 */
public class AlipayOpenSearchboxUpgradePreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3133175926545145413L;

	/** 
	 * 准入校验
	 */
	@ApiField("access_check_info")
	private AccessCheckInfo accessCheckInfo;

	/** 
	 * 可申请的box类型; 为空代表不满足条件, 可通过 access_check_info查看不匹配规则详情
	 */
	@ApiField("applicable_box_type")
	private String applicableBoxType;

	/** 
	 * 品牌认证信息
	 */
	@ApiField("brand_cert_info")
	private BrandCertInfo brandCertInfo;

	/** 
	 * 运营主体id;applicableBoxType不为空时,返回值不为空;品牌直达返回品牌id，其他直达返回小程序id
	 */
	@ApiField("opt_principal_id")
	private String optPrincipalId;

	/** 
	 * 小程序信息
	 */
	@ApiField("tiny_app_info")
	private SearchBoxAppInfo tinyAppInfo;

	public void setAccessCheckInfo(AccessCheckInfo accessCheckInfo) {
		this.accessCheckInfo = accessCheckInfo;
	}
	public AccessCheckInfo getAccessCheckInfo( ) {
		return this.accessCheckInfo;
	}

	public void setApplicableBoxType(String applicableBoxType) {
		this.applicableBoxType = applicableBoxType;
	}
	public String getApplicableBoxType( ) {
		return this.applicableBoxType;
	}

	public void setBrandCertInfo(BrandCertInfo brandCertInfo) {
		this.brandCertInfo = brandCertInfo;
	}
	public BrandCertInfo getBrandCertInfo( ) {
		return this.brandCertInfo;
	}

	public void setOptPrincipalId(String optPrincipalId) {
		this.optPrincipalId = optPrincipalId;
	}
	public String getOptPrincipalId( ) {
		return this.optPrincipalId;
	}

	public void setTinyAppInfo(SearchBoxAppInfo tinyAppInfo) {
		this.tinyAppInfo = tinyAppInfo;
	}
	public SearchBoxAppInfo getTinyAppInfo( ) {
		return this.tinyAppInfo;
	}

}
