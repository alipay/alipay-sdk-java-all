package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动报名素材
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:15:34
 */
public class RecruitEnrollMaterial extends AlipayObject {

	private static final long serialVersionUID = 6713783249229149397L;

	/**
	 * 报名提交的素材列表。
	 */
	@ApiListField("materials")
	@ApiField("recruit_material_info")
	private List<RecruitMaterialInfo> materials;

	public List<RecruitMaterialInfo> getMaterials() {
		return this.materials;
	}
	public void setMaterials(List<RecruitMaterialInfo> materials) {
		this.materials = materials;
	}

}
