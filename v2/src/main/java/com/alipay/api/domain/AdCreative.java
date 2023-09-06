package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告创意信息
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:16:36
 */
public class AdCreative extends AlipayObject {

	private static final long serialVersionUID = 2671827762386218954L;

	/**
	 * 广告物料包含的物料列表
	 */
	@ApiListField("ad_material_list")
	@ApiField("ad_material")
	private List<AdMaterial> adMaterialList;

	/**
	 * 创意名称
	 */
	@ApiField("ad_name")
	private String adName;

	/**
	 * 所属广告单元ID
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 创意使用模板ID
	 */
	@ApiField("template_id")
	private Long templateId;

	public List<AdMaterial> getAdMaterialList() {
		return this.adMaterialList;
	}
	public void setAdMaterialList(List<AdMaterial> adMaterialList) {
		this.adMaterialList = adMaterialList;
	}

	public String getAdName() {
		return this.adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
