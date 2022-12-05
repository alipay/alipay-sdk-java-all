package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.lesson.userlessonrecord.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-02 10:46:37
 */
public class AlipayCommerceSportsLessonUserlessonrecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2219637555475719781L;

	/** 
	 * 运动币数量
	 */
	@ApiField("sport_coin_num")
	private Long sportCoinNum;

	public void setSportCoinNum(Long sportCoinNum) {
		this.sportCoinNum = sportCoinNum;
	}
	public Long getSportCoinNum( ) {
		return this.sportCoinNum;
	}

}
