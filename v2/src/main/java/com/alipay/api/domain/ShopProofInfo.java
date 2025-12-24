package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店证明其它材料
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:09:27
 */
public class ShopProofInfo extends AlipayObject {

	private static final long serialVersionUID = 2283391312638353659L;

	/**
	 * 授权材料图片
	 */
	@ApiField("appeal_letter_url")
	private String appealLetterUrl;

	/**
	 * 租赁合同图片
	 */
	@ApiField("lease_contract_url")
	private String leaseContractUrl;

	/**
	 * 产权证明图片
	 */
	@ApiField("property_ownership_proof_url")
	private String propertyOwnershipProofUrl;

	public String getAppealLetterUrl() {
		return this.appealLetterUrl;
	}
	public void setAppealLetterUrl(String appealLetterUrl) {
		this.appealLetterUrl = appealLetterUrl;
	}

	public String getLeaseContractUrl() {
		return this.leaseContractUrl;
	}
	public void setLeaseContractUrl(String leaseContractUrl) {
		this.leaseContractUrl = leaseContractUrl;
	}

	public String getPropertyOwnershipProofUrl() {
		return this.propertyOwnershipProofUrl;
	}
	public void setPropertyOwnershipProofUrl(String propertyOwnershipProofUrl) {
		this.propertyOwnershipProofUrl = propertyOwnershipProofUrl;
	}

}
