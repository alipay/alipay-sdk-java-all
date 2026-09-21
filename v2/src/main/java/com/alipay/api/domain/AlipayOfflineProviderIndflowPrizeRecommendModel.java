package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发奖一阶段recommend接口
 *
 * @author auto create
 * @since 1.0, 2026-09-10 10:12:57
 */
public class AlipayOfflineProviderIndflowPrizeRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 3897173916711716989L;

	/**
	 * null
	 */
	@ApiListField("instance_ids")
	@ApiField("string")
	private List<String> instanceIds;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 展位id
	 */
	@ApiField("out_pos_id")
	private String outPosId;

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}
	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getOutPosId() {
		return this.outPosId;
	}
	public void setOutPosId(String outPosId) {
		this.outPosId = outPosId;
	}

}
