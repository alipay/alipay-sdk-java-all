package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpeakerActivityItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.broadcast.activitytime.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 15:07:42
 */
public class AlipayOfflineProviderBroadcastActivitytimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7617382955124659879L;

	/** 
	 * 分页每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 碰音箱激活时间数据集合
	 */
	@ApiListField("speaker_activity_list")
	@ApiField("speaker_activity_item")
	private List<SpeakerActivityItem> speakerActivityList;

	/** 
	 * 数据总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setSpeakerActivityList(List<SpeakerActivityItem> speakerActivityList) {
		this.speakerActivityList = speakerActivityList;
	}
	public List<SpeakerActivityItem> getSpeakerActivityList( ) {
		return this.speakerActivityList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
