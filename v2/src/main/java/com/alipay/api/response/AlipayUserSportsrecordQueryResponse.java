package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SportsRecordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.sportsrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-01 16:36:41
 */
public class AlipayUserSportsrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6319299418445112396L;

	/** 
	 * 是否有更多数据
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * {"record_id":"dfasdjkfhasdjkhfdkas","record_date":"2023-08-28","sport_type":"run"}
	 */
	@ApiListField("record_list")
	@ApiField("sports_record_info")
	private List<SportsRecordInfo> recordList;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setRecordList(List<SportsRecordInfo> recordList) {
		this.recordList = recordList;
	}
	public List<SportsRecordInfo> getRecordList( ) {
		return this.recordList;
	}

}
