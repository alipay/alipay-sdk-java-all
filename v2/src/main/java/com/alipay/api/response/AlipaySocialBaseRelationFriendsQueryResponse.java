package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FriendListVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.relation.friends.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:33
 */
public class AlipaySocialBaseRelationFriendsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7227487546183964852L;

	/** 
	 * 好友列表数据
	 */
	@ApiListField("friend_list")
	@ApiField("friend_list_v_o")
	private List<FriendListVO> friendList;

	public void setFriendList(List<FriendListVO> friendList) {
		this.friendList = friendList;
	}
	public List<FriendListVO> getFriendList( ) {
		return this.friendList;
	}

}
