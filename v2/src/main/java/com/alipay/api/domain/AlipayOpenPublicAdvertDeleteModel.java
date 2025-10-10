package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告删除询接口
 *
 * @author auto create
 * @since 1.0, 2024-09-10 14:12:15
 */
public class AlipayOpenPublicAdvertDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1252368857541497888L;

	/**
	 * 待删除的广告位分组标识，删除个性化广告位需传递此参数。
	 */
	@ApiField("advert_group")
	private String advertGroup;

	/**
	 * 待删除的广告位id，删除通投广告位需传递此参数
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
