package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电商投保准入接口
 *
 * @author auto create
 * @since 1.0, 2022-08-29 12:07:35
 */
public class AlipayInsSceneEcommerceInsureCheckModel extends AlipayObject {

	private static final long serialVersionUID = 6755421565541738912L;

	/**
	 * 批量的【商品、卖家和卖家信息】
	 */
	@ApiListField("insure_admit_dto_list")
	@ApiField("insure_admit_d_t_o")
	private List<InsureAdmitDTO> insureAdmitDtoList;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 客户端渠道
	 */
	@ApiField("user_client")
	private String userClient;

	public List<InsureAdmitDTO> getInsureAdmitDtoList() {
		return this.insureAdmitDtoList;
	}
	public void setInsureAdmitDtoList(List<InsureAdmitDTO> insureAdmitDtoList) {
		this.insureAdmitDtoList = insureAdmitDtoList;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
