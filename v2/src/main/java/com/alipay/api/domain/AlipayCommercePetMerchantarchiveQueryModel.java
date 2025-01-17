package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户宠物档案查询
 *
 * @author auto create
 * @since 1.0, 2024-09-03 20:19:18
 */
public class AlipayCommercePetMerchantarchiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4891624136274739148L;

	/**
	 * 支付宝宠物档案Id, 与external_pet_id 二选一
	 */
	@ApiField("archive_id")
	private String archiveId;

	/**
	 * 商户宠物Id
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
