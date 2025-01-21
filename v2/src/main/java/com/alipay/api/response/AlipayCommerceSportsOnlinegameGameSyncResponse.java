package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OnlineGameInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.onlinegame.game.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 14:27:04
 */
public class AlipayCommerceSportsOnlinegameGameSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2684529855781487256L;

	/** 
	 * 线上赛事信息
	 */
	@ApiField("online_game_info")
	private OnlineGameInfo onlineGameInfo;

	public void setOnlineGameInfo(OnlineGameInfo onlineGameInfo) {
		this.onlineGameInfo = onlineGameInfo;
	}
	public OnlineGameInfo getOnlineGameInfo( ) {
		return this.onlineGameInfo;
	}

}
