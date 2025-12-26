package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FriendVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.games.friendlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:27
 */
public class AlipayCommerceSportsGamesFriendlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3434357975147647446L;

	/** 
	 * 好友信息集合
	 */
	@ApiListField("friend_list")
	@ApiField("friend_v_o")
	private List<FriendVO> friendList;

	/** 
	 * 用户open_id
	 */
	@ApiField("self_open_id")
	private String selfOpenId;

	public void setFriendList(List<FriendVO> friendList) {
		this.friendList = friendList;
	}
	public List<FriendVO> getFriendList( ) {
		return this.friendList;
	}

	public void setSelfOpenId(String selfOpenId) {
		this.selfOpenId = selfOpenId;
	}
	public String getSelfOpenId( ) {
		return this.selfOpenId;
	}

}
