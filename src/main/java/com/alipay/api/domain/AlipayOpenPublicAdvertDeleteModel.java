package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告删除询接口
 *
 * @author auto create
 * @since 1.0, 2020-09-28 09:38:29
 */
public class AlipayOpenPublicAdvertDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7434741615325774568L;

	/**
	 * 待删除的广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public String getAdvertId() {
		return this.advertId;
	}
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

}
