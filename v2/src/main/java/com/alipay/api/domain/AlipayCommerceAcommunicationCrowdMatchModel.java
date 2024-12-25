package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运营商行业人群匹配
 *
 * @author auto create
 * @since 1.0, 2024-04-30 14:19:38
 */
public class AlipayCommerceAcommunicationCrowdMatchModel extends AlipayObject {

	private static final long serialVersionUID = 8711311349967895594L;

	/**
	 * 运营商行业定义的人群ID，运营商行业给出
	 */
	@ApiListField("crowd_id")
	@ApiField("string")
	private List<String> crowdId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(List<String> crowdId) {
		this.crowdId = crowdId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
