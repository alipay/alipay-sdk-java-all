package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.groups.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:21
 */
public class AlipaySocialBaseChatGroupsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2765761416257576274L;

	/** 
	 * 群信息列表
	 */
	@ApiListField("group_infos")
	@ApiField("group_info")
	private List<GroupInfo> groupInfos;

	/** 
	 * 是否有更多
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 同步的key，下一次分页获取使用
	 */
	@ApiField("last_key")
	private Long lastKey;

	public void setGroupInfos(List<GroupInfo> groupInfos) {
		this.groupInfos = groupInfos;
	}
	public List<GroupInfo> getGroupInfos( ) {
		return this.groupInfos;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setLastKey(Long lastKey) {
		this.lastKey = lastKey;
	}
	public Long getLastKey( ) {
		return this.lastKey;
	}

}
