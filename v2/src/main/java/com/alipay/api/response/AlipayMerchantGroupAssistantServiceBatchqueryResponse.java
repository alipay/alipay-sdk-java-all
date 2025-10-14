package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceAssistantRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.service.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 18:09:36
 */
public class AlipayMerchantGroupAssistantServiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8266556747297931993L;

	/** 
	 * 小助手快捷服务记录列表
	 */
	@ApiListField("assistant_record_list")
	@ApiField("service_assistant_record_v_o")
	private List<ServiceAssistantRecordVO> assistantRecordList;

	/** 
	 * 商家配置小助手快捷服务总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAssistantRecordList(List<ServiceAssistantRecordVO> assistantRecordList) {
		this.assistantRecordList = assistantRecordList;
	}
	public List<ServiceAssistantRecordVO> getAssistantRecordList( ) {
		return this.assistantRecordList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
