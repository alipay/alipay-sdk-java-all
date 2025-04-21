package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户宠物档案删除
 *
 * @author auto create
 * @since 1.0, 2024-09-03 15:52:17
 */
public class AlipayCommercePetMerchantarchiveDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7731715862144562178L;

	/**
	 * 支付宝宠物档案Id
	 */
	@ApiField("archive_id")
	private String archiveId;

	/**
	 * 商户宠物Id，与archive_id 二选一
	 */
	@ApiField("external_pet_id")
	private String externalPetId;

	public String getArchiveId() {
		return this.archiveId;
	}
	public void setArchiveId(String archiveId) {
		this.archiveId = archiveId;
	}

	public String getExternalPetId() {
		return this.externalPetId;
	}
	public void setExternalPetId(String externalPetId) {
		this.externalPetId = externalPetId;
	}

}
