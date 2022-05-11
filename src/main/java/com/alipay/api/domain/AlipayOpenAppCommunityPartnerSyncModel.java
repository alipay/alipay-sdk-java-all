package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 社区参与者关系同步
 *
 * @author auto create
 * @since 1.0, 2020-06-22 14:30:28
 */
public class AlipayOpenAppCommunityPartnerSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5224781263896223319L;

	/**
	 * 操作类型(PUT/REMOVE)
	 */
	@ApiField("action")
	private String action;

	/**
	 * 关系类型
	 */
	@ApiField("rela_type")
	private String relaType;

	/**
	 * 关系来源
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 源对象id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 目标对象列表
	 */
	@ApiListField("target_list")
	@ApiField("community_partner_relation_data_sync_d_t_o")
	private List<CommunityPartnerRelationDataSyncDTO> targetList;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getRelaType() {
		return this.relaType;
	}
	public void setRelaType(String relaType) {
		this.relaType = relaType;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public List<CommunityPartnerRelationDataSyncDTO> getTargetList() {
		return this.targetList;
	}
	public void setTargetList(List<CommunityPartnerRelationDataSyncDTO> targetList) {
		this.targetList = targetList;
	}

}
