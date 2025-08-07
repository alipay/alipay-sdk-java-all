package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PlantPlace;
import com.alipay.api.domain.UserCert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.forest.certificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 15:33:53
 */
public class AlipaySocialForestCertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7397581976666222384L;

	/** 
	 * 对应树种的证书数量，JSON
	 */
	@ApiField("cert_count_by_tree")
	private String certCountByTree;

	/** 
	 * 当前用户是否是森林用户
	 */
	@ApiField("forest_user")
	private Boolean forestUser;

	/** 
	 * 用户所有已经种下的树种的林区信息
	 */
	@ApiField("plant_place_info")
	private PlantPlace plantPlaceInfo;

	/** 
	 * 用户碳账户总能量
	 */
	@ApiField("total_carbon_amount")
	private Long totalCarbonAmount;

	/** 
	 * 用户低碳行为总次数
	 */
	@ApiField("total_carbon_count")
	private Long totalCarbonCount;

	/** 
	 * 用户环保证书总数量
	 */
	@ApiField("total_cert_count")
	private Long totalCertCount;

	/** 
	 * 用户的证书列表，只透出最近的几个
	 */
	@ApiField("user_certs")
	private UserCert userCerts;

	public void setCertCountByTree(String certCountByTree) {
		this.certCountByTree = certCountByTree;
	}
	public String getCertCountByTree( ) {
		return this.certCountByTree;
	}

	public void setForestUser(Boolean forestUser) {
		this.forestUser = forestUser;
	}
	public Boolean getForestUser( ) {
		return this.forestUser;
	}

	public void setPlantPlaceInfo(PlantPlace plantPlaceInfo) {
		this.plantPlaceInfo = plantPlaceInfo;
	}
	public PlantPlace getPlantPlaceInfo( ) {
		return this.plantPlaceInfo;
	}

	public void setTotalCarbonAmount(Long totalCarbonAmount) {
		this.totalCarbonAmount = totalCarbonAmount;
	}
	public Long getTotalCarbonAmount( ) {
		return this.totalCarbonAmount;
	}

	public void setTotalCarbonCount(Long totalCarbonCount) {
		this.totalCarbonCount = totalCarbonCount;
	}
	public Long getTotalCarbonCount( ) {
		return this.totalCarbonCount;
	}

	public void setTotalCertCount(Long totalCertCount) {
		this.totalCertCount = totalCertCount;
	}
	public Long getTotalCertCount( ) {
		return this.totalCertCount;
	}

	public void setUserCerts(UserCert userCerts) {
		this.userCerts = userCerts;
	}
	public UserCert getUserCerts( ) {
		return this.userCerts;
	}

}
