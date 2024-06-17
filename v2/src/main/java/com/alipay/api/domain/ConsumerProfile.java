package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费者画像
 *
 * @author auto create
 * @since 1.0, 2021-02-26 14:08:20
 */
public class ConsumerProfile extends AlipayObject {

	private static final long serialVersionUID = 2733478766429652253L;

	/**
	 * 消费者画像，包含各年龄段消费者人群占比， 性别占比、复购次数占比等
	 */
	@ApiField("consumer_profile")
	private String consumerProfile;

	public String getConsumerProfile() {
		return this.consumerProfile;
	}
	public void setConsumerProfile(String consumerProfile) {
		this.consumerProfile = consumerProfile;
	}

}
