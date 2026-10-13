package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RoomBatchCreateResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.room.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 11:12:56
 */
public class AlipayEbppCommunityRoomBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8367895397461289522L;

	/** 
	 * 失败数
	 */
	@ApiField("fail_count")
	private String failCount;

	/** 
	 * 明细结果
	 */
	@ApiListField("results")
	@ApiField("room_batch_create_result")
	private List<RoomBatchCreateResult> results;

	/** 
	 * 成功数
	 */
	@ApiField("success_count")
	private String successCount;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setFailCount(String failCount) {
		this.failCount = failCount;
	}
	public String getFailCount( ) {
		return this.failCount;
	}

	public void setResults(List<RoomBatchCreateResult> results) {
		this.results = results;
	}
	public List<RoomBatchCreateResult> getResults( ) {
		return this.results;
	}

	public void setSuccessCount(String successCount) {
		this.successCount = successCount;
	}
	public String getSuccessCount( ) {
		return this.successCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
