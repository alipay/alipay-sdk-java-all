package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量变更计划状态
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:54
 */
public class AlipayDataDataserviceAdcampaignBatchupplanstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5654916751762778145L;

	/**
	 * 计划id集合
	 */
	@ApiListField("ids")
	@ApiField("number")
	private List<Long> ids;

	/**
	 * 计划操作类型(ENABLE（启用）/PAUSE（暂停）)
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public List<Long> getIds() {
		return this.ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
