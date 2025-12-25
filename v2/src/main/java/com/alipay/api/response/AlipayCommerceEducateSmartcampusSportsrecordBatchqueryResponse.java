package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SportsToolRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.smartcampus.sportsrecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-23 15:17:40
 */
public class AlipayCommerceEducateSmartcampusSportsrecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1254833777547288223L;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 运动记录列表
	 */
	@ApiListField("sports_record_list")
	@ApiField("sports_tool_record")
	private List<SportsToolRecord> sportsRecordList;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setSportsRecordList(List<SportsToolRecord> sportsRecordList) {
		this.sportsRecordList = sportsRecordList;
	}
	public List<SportsToolRecord> getSportsRecordList( ) {
		return this.sportsRecordList;
	}

}
