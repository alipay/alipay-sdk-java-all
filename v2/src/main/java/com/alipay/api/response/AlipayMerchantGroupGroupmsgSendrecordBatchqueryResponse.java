package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupMsgRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupmsg.sendrecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-11 15:42:40
 */
public class AlipayMerchantGroupGroupmsgSendrecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8394945843711525256L;

	/** 
	 * null
	 */
	@ApiListField("msg_record_list")
	@ApiField("group_msg_record_v_o")
	private List<GroupMsgRecordVO> msgRecordList;

	/** 
	 * 当前页码

	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页展示记录条数

	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 商家群群发消息记录总条数

	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMsgRecordList(List<GroupMsgRecordVO> msgRecordList) {
		this.msgRecordList = msgRecordList;
	}
	public List<GroupMsgRecordVO> getMsgRecordList( ) {
		return this.msgRecordList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
