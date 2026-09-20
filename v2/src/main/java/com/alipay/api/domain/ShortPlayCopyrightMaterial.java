package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短剧版权材料。
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:58:03
 */
public class ShortPlayCopyrightMaterial extends AlipayObject {

	private static final long serialVersionUID = 2698571726395367247L;

	/**
	 * 承诺函及作品清单媒资ID
	 */
	@ApiListField("commitment_material_ids")
	@ApiField("string")
	private List<String> commitmentMaterialIds;

	/**
	 * 版权授权证明媒资ID
	 */
	@ApiListField("license_material_ids")
	@ApiField("string")
	private List<String> licenseMaterialIds;

	/**
	 * 版权归属证明媒资ID
	 */
	@ApiListField("ownership_material_ids")
	@ApiField("string")
	private List<String> ownershipMaterialIds;

	/**
	 * 标题修改申请书媒资ID。审核通过后再次修改标题时必填
	 */
	@ApiField("title_modification_material_id")
	private String titleModificationMaterialId;

	public List<String> getCommitmentMaterialIds() {
		return this.commitmentMaterialIds;
	}
	public void setCommitmentMaterialIds(List<String> commitmentMaterialIds) {
		this.commitmentMaterialIds = commitmentMaterialIds;
	}

	public List<String> getLicenseMaterialIds() {
		return this.licenseMaterialIds;
	}
	public void setLicenseMaterialIds(List<String> licenseMaterialIds) {
		this.licenseMaterialIds = licenseMaterialIds;
	}

	public List<String> getOwnershipMaterialIds() {
		return this.ownershipMaterialIds;
	}
	public void setOwnershipMaterialIds(List<String> ownershipMaterialIds) {
		this.ownershipMaterialIds = ownershipMaterialIds;
	}

	public String getTitleModificationMaterialId() {
		return this.titleModificationMaterialId;
	}
	public void setTitleModificationMaterialId(String titleModificationMaterialId) {
		this.titleModificationMaterialId = titleModificationMaterialId;
	}

}
