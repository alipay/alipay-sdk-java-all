package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险查询档案列表信息
 *
 * @author auto create
 * @since 1.0, 2021-06-25 09:45:11
 */
public class AlipayInsSceneInsassetprodPetprofilelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5194568656291728579L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
