package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序备案小程序信息
 *
 * @author auto create
 * @since 1.0, 2024-01-19 18:19:17
 */
public class IcpAppletsInfo extends AlipayObject {

	private static final long serialVersionUID = 6788354896729631741L;

	/**
	 * 小程序附件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiListField("attachement_materials")
	@ApiField("string")
	private List<String> attachementMaterials;

	/**
	 * 小程序备注
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 小程序前置审批项信息
	 */
	@ApiListField("icp_audit_infos")
	@ApiField("icp_audit_info_list")
	private List<IcpAuditInfoList> icpAuditInfos;

	/**
	 * 小程序服务内容标识（参考：获取服务内容标识的接口）
	 */
	@ApiField("main_category_id")
	private String mainCategoryId;

	public List<String> getAttachementMaterials() {
		return this.attachementMaterials;
	}
	public void setAttachementMaterials(List<String> attachementMaterials) {
		this.attachementMaterials = attachementMaterials;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<IcpAuditInfoList> getIcpAuditInfos() {
		return this.icpAuditInfos;
	}
	public void setIcpAuditInfos(List<IcpAuditInfoList> icpAuditInfos) {
		this.icpAuditInfos = icpAuditInfos;
	}

	public String getMainCategoryId() {
		return this.mainCategoryId;
	}
	public void setMainCategoryId(String mainCategoryId) {
		this.mainCategoryId = mainCategoryId;
	}

}
