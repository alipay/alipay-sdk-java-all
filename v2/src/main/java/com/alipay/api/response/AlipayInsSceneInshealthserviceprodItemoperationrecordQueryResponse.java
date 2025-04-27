package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExternalItemOperationRecordQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inshealthserviceprod.itemoperationrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:01:47
 */
public class AlipayInsSceneInshealthserviceprodItemoperationrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3354931256136852924L;

	/** 
	 * 操作记录列表
	 */
	@ApiListField("record_list")
	@ApiField("external_item_operation_record_query_d_t_o")
	private List<ExternalItemOperationRecordQueryDTO> recordList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setRecordList(List<ExternalItemOperationRecordQueryDTO> recordList) {
		this.recordList = recordList;
	}
	public List<ExternalItemOperationRecordQueryDTO> getRecordList( ) {
		return this.recordList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
