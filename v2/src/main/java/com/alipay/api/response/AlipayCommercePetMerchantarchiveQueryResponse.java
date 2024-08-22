package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndustryPetArchiveDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.pet.merchantarchive.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 15:22:06
 */
public class AlipayCommercePetMerchantarchiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5371979392659542413L;

	/** 
	 * 档案详情
	 */
	@ApiField("pet_archive_info")
	private IndustryPetArchiveDTO petArchiveInfo;

	public void setPetArchiveInfo(IndustryPetArchiveDTO petArchiveInfo) {
		this.petArchiveInfo = petArchiveInfo;
	}
	public IndustryPetArchiveDTO getPetArchiveInfo( ) {
		return this.petArchiveInfo;
	}

}
