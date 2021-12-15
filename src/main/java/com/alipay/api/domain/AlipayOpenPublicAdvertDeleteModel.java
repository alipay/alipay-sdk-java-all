package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告删除询接口
 *
 * @author auto create
 * @since 1.0, 2021-01-25 16:31:11
 */
public class AlipayOpenPublicAdvertDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6682143558757869661L;

	/**
	 * 待删除的广告位分组标识
	 */
	@ApiField("advert_group")
	private String advertGroup;

	/**
	 * 待删除的广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public String getAdvertGroup() {
		return this.advertGroup;
	}
	public void setAdvertGroup(String advertGroup) {
		this.advertGroup = advertGroup;
	}

	public String getAdvertId() {
		return this.advertId;
	}
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

}
