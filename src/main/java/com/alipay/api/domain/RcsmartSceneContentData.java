package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解语花审核素材
 *
 * @author auto create
 * @since 1.0, 2022-08-23 15:10:38
 */
public class RcsmartSceneContentData extends AlipayObject {

	private static final long serialVersionUID = 4561678828268617846L;

	/**
	 * 审核素材列表
	 */
	@ApiListField("audit_content_list")
	@ApiField("rcsmart_audit_content")
	private List<RcsmartAuditContent> auditContentList;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<RcsmartAuditContent> getAuditContentList() {
		return this.auditContentList;
	}
	public void setAuditContentList(List<RcsmartAuditContent> auditContentList) {
		this.auditContentList = auditContentList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
