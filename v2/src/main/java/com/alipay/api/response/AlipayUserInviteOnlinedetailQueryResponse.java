package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OnlineInviteNewerDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.onlinedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:35:53
 */
public class AlipayUserInviteOnlinedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2436164567698225534L;

	/** 
	 * 线上拉新结算明细数据列表
	 */
	@ApiListField("online_detail_info_list")
	@ApiField("online_invite_newer_detail_info")
	private List<OnlineInviteNewerDetailInfo> onlineDetailInfoList;

	/** 
	 * 页大小
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setOnlineDetailInfoList(List<OnlineInviteNewerDetailInfo> onlineDetailInfoList) {
		this.onlineDetailInfoList = onlineDetailInfoList;
	}
	public List<OnlineInviteNewerDetailInfo> getOnlineDetailInfoList( ) {
		return this.onlineDetailInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
