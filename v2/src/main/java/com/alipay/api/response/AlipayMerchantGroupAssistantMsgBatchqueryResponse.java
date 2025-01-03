package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssistantMsgRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.msg.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 15:37:15
 */
public class AlipayMerchantGroupAssistantMsgBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3178268751541437952L;

	/** 
	 * 商家发送的小助手定向消息记录列表
	 */
	@ApiListField("msg_record_list")
	@ApiField("assistant_msg_record_v_o")
	private List<AssistantMsgRecordVO> msgRecordList;

	/** 
	 * 商家配置小助手定向消息总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMsgRecordList(List<AssistantMsgRecordVO> msgRecordList) {
		this.msgRecordList = msgRecordList;
	}
	public List<AssistantMsgRecordVO> getMsgRecordList( ) {
		return this.msgRecordList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
