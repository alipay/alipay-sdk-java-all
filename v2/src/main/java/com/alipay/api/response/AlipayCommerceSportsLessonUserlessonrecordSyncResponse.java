package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.lesson.userlessonrecord.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:51:50
 */
public class AlipayCommerceSportsLessonUserlessonrecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1895328635624291211L;

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
