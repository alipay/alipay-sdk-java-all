package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserOnlineGameDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.onlinegame.usergamedata.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 14:17:05
 */
public class AlipayCommerceSportsOnlinegameUsergamedataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2853912299259418124L;

	/** 
	 * 分页接口，是否有更多数据，还有数据返回true，否则返回false
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 用户参赛数据信息
	 */
	@ApiListField("user_online_game_data_info_list")
	@ApiField("user_online_game_data_info")
	private List<UserOnlineGameDataInfo> userOnlineGameDataInfoList;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setUserOnlineGameDataInfoList(List<UserOnlineGameDataInfo> userOnlineGameDataInfoList) {
		this.userOnlineGameDataInfoList = userOnlineGameDataInfoList;
	}
	public List<UserOnlineGameDataInfo> getUserOnlineGameDataInfoList( ) {
		return this.userOnlineGameDataInfoList;
	}

}
