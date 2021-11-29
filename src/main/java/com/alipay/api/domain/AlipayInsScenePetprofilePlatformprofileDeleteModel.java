package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台宠物档案删除
 *
 * @author auto create
 * @since 1.0, 2021-11-24 10:53:01
 */
public class AlipayInsScenePetprofilePlatformprofileDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4385661976784114339L;

	/**
	 * 创建档案后，生成的档案唯一标记
	 */
	@ApiField("pet_id")
	private String petId;

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

}
