package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索结果分组
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:18:37
 */
public class GroupRecord extends AlipayObject {

	private static final long serialVersionUID = 6768764636468396366L;

	/**
	 * 本次返回的结果数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 展位ID，finetinyapp：精品小程序 finecard：场景card
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 显示名称，可为空
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 是否还有更多结果
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/**
	 * 命中结果
	 */
	@ApiListField("hits")
	@ApiField("hit")
	private List<Hit> hits;

	/**
	 * 更多显示名称
	 */
	@ApiField("more_link_name")
	private String moreLinkName;

	/**
	 * 更多url
	 */
	@ApiField("more_link_url")
	private String moreLinkUrl;

	/**
	 * 搜索命中结果总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Boolean getHasMore() {
		return this.hasMore;
	}
	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<Hit> getHits() {
		return this.hits;
	}
	public void setHits(List<Hit> hits) {
		this.hits = hits;
	}

	public String getMoreLinkName() {
		return this.moreLinkName;
	}
	public void setMoreLinkName(String moreLinkName) {
		this.moreLinkName = moreLinkName;
	}

	public String getMoreLinkUrl() {
		return this.moreLinkUrl;
	}
	public void setMoreLinkUrl(String moreLinkUrl) {
		this.moreLinkUrl = moreLinkUrl;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
