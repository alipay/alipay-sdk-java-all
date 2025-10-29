package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证明材料
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseProofInfo extends AlipayObject {

	private static final long serialVersionUID = 1486271654832256725L;

	/**
	 * 授权材料图片，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("appeal_letter_url")
	private String appealLetterUrl;

	/**
	 * 租赁合同图片，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("lease_contract_url")
	private String leaseContractUrl;

	/**
	 * 产权证明图片，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
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
