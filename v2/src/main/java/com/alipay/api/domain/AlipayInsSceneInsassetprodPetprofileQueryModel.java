package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险创建宠物档案
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:23:23
 */
public class AlipayInsSceneInsassetprodPetprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4523986726451281698L;

	/**
	 * 渠道类型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 宠物ID
	 */
	@ApiField("pet_id")
	private String petId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

}
