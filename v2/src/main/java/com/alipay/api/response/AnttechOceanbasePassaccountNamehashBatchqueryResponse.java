package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassAccountNameHashRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passaccount.namehash.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 10:47:56
 */
public class AnttechOceanbasePassaccountNamehashBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7568181568874586146L;

	/** 
	 * 返回的账号信息
	 */
	@ApiListField("records")
	@ApiField("pass_account_name_hash_record_d_t_o")
	private List<PassAccountNameHashRecordDTO> records;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setRecords(List<PassAccountNameHashRecordDTO> records) {
		this.records = records;
	}
	public List<PassAccountNameHashRecordDTO> getRecords( ) {
		return this.records;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
