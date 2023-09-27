package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserOnlineGameInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.onlinegame.usergame.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:26:58
 */
public class AlipayCommerceSportsOnlinegameUsergameSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2891998119572365735L;

	/** 
	 * 用户参赛信息
	 */
	@ApiField("user_online_game_info")
	private UserOnlineGameInfo userOnlineGameInfo;

	public void setUserOnlineGameInfo(UserOnlineGameInfo userOnlineGameInfo) {
		this.userOnlineGameInfo = userOnlineGameInfo;
	}
	public UserOnlineGameInfo getUserOnlineGameInfo( ) {
		return this.userOnlineGameInfo;
	}

}
