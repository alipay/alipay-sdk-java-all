package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量操作创意状态
 *
 * @author auto create
 * @since 1.0, 2025-05-06 19:31:31
 */
public class AlipayDataDataserviceAdcampaignBatchcreativestatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8834344988184396968L;

	/**
	 * 创意id集合
	 */
	@ApiListField("ids")
	@ApiField("number")
	private List<Long> ids;

	/**
	 * 创意操作类型(ENABLE（启用）/PAUSE（暂停）)
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
