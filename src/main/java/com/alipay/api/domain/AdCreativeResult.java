package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告创意查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:16:42
 */
public class AdCreativeResult extends AlipayObject {

	private static final long serialVersionUID = 8711414834532966141L;

	/**
	 * 广告创意ID
	 */
	@ApiField("ad_id")
	private Long adId;

	/**
	 * 创意包含的物料列表
	 */
	@ApiListField("ad_material_list")
	@ApiField("ad_material_result_d_t_o")
	private List<AdMaterialResultDTO> adMaterialList;

	/**
	 * 创意名称
	 */
	@ApiField("ad_name")
	private String adName;

	/**
	 * 创意审核状态，PASS：审核通过；TO_BE_AUDTI：待审核；OP_AUDIT：运营审核中；MEDIA_AUDIT：媒体审核中；REFUSED：审核拒绝
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 所属广告单元ID
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 创意状态，ENABLE：生效；DISABLE：失效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 创意使用模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public Long getAdId() {
		return this.adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}

	public List<AdMaterialResultDTO> getAdMaterialList() {
		return this.adMaterialList;
	}
	public void setAdMaterialList(List<AdMaterialResultDTO> adMaterialList) {
		this.adMaterialList = adMaterialList;
	}

	public String getAdName() {
		return this.adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
