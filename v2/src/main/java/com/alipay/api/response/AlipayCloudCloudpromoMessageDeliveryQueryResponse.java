package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CallRecordDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-25 17:42:17
 */
public class AlipayCloudCloudpromoMessageDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6487132344429334139L;

	/** 
	 * 触达记录结果详情
	 */
	@ApiListField("call_record_details")
	@ApiField("call_record_detail")
	private List<CallRecordDetail> callRecordDetails;

	/** 
	 * 智能触达时记录ID，用于查询触达结果
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 记录状态：INIT-初始化,PROCESSING-外呼进行中,FINISHED-外呼完成,FAILED-外呼失败
	 */
	@ApiField("status")
	private String status;

	public void setCallRecordDetails(List<CallRecordDetail> callRecordDetails) {
		this.callRecordDetails = callRecordDetails;
	}
	public List<CallRecordDetail> getCallRecordDetails( ) {
		return this.callRecordDetails;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
