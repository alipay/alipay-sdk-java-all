package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改店铺结算信息
 *
 * @author auto create
 * @since 1.0, 2026-06-26 21:15:54
 */
public class ProofInfo extends AlipayObject {

	private static final long serialVersionUID = 2878576595824143851L;

	/**
	 * 资金证明材料url列表
	 */
	@ApiListField("fund_proofs_url")
	@ApiField("string")
	private List<String> fundProofsUrl;

	/**
	 * 资金类型：加盟关系 01、集团关系 02、商圈关系 03
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 法人身份证正面证件
	 */
	@ApiField("legal_cert_image")
	private String legalCertImage;

	/**
	 * 法人身份证反面证件
	 */
	@ApiField("legal_cert_image_back")
	private String legalCertImageBack;

	/**
	 * 营业执照
	 */
	@ApiField("org_cert_image")
	private String orgCertImage;

	public List<String> getFundProofsUrl() {
		return this.fundProofsUrl;
	}
	public void setFundProofsUrl(List<String> fundProofsUrl) {
		this.fundProofsUrl = fundProofsUrl;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getLegalCertImage() {
		return this.legalCertImage;
	}
	public void setLegalCertImage(String legalCertImage) {
		this.legalCertImage = legalCertImage;
	}

	public String getLegalCertImageBack() {
		return this.legalCertImageBack;
	}
	public void setLegalCertImageBack(String legalCertImageBack) {
		this.legalCertImageBack = legalCertImageBack;
	}

	public String getOrgCertImage() {
		return this.orgCertImage;
	}
	public void setOrgCertImage(String orgCertImage) {
		this.orgCertImage = orgCertImage;
	}

}
