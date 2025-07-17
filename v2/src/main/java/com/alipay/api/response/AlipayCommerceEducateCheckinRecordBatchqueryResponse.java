package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduCheckInRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.checkin.record.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-16 16:47:33
 */
public class AlipayCommerceEducateCheckinRecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5669636694872417634L;

	/** 
	 * 签到记录列表
	 */
	@ApiListField("record_list")
	@ApiField("edu_check_in_record")
	private List<EduCheckInRecord> recordList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRecordList(List<EduCheckInRecord> recordList) {
		this.recordList = recordList;
	}
	public List<EduCheckInRecord> getRecordList( ) {
		return this.recordList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
