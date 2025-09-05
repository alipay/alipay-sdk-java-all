package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意模版与创意可选交互内容配置查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class AlipayDataDataserviceAdcampaignActionandtemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8125846843918283759L;

	/**
	 * 编辑创意场景下,所编辑创意的id
	 */
	@ApiField("creative_id")
	private Long creativeId;

	/**
	 * 新增或者编辑创意所属的单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 创意操作类型,新增或者编辑创意
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作商家所属委托人标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public Long getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
