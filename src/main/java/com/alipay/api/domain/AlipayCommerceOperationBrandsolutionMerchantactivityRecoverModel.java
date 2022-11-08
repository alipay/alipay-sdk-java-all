package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消百万小店商家单品活动恢复
 *
 * @author auto create
 * @since 1.0, 2022-05-09 13:23:34
 */
public class AlipayCommerceOperationBrandsolutionMerchantactivityRecoverModel extends AlipayObject {

	private static final long serialVersionUID = 1755548217593277331L;

	/**
	 * 活动唯一标识
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户pid，唯一标识，允许批量修改，单次最大10条
	 */
	@ApiListField("merchant_ids")
	@ApiField("string")
	private List<String> merchantIds;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<String> getMerchantIds() {
		return this.merchantIds;
	}
	public void setMerchantIds(List<String> merchantIds) {
		this.merchantIds = merchantIds;
	}

}
