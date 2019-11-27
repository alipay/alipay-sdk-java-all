package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertAdvDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.mission.receive response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionMissionReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1352366833727255454L;

	/** 
	 * 广告信息
推广者领取任务后，获得任务推广权限，并返回广告ID，
推广者根据广告ID发券，从而确保后续分佣时，分佣到推广者
	 */
	@ApiField("advert")
	private KbAdvertAdvDetailResponse advert;

	public void setAdvert(KbAdvertAdvDetailResponse advert) {
		this.advert = advert;
	}
	public KbAdvertAdvDetailResponse getAdvert( ) {
		return this.advert;
	}

}
