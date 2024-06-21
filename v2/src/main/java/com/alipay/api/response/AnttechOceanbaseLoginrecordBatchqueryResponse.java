package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoginRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.loginrecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-17 13:52:00
 */
public class AnttechOceanbaseLoginrecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4389444896414138798L;

	/** 
	 * 登录记录列表
	 */
	@ApiListField("login_records")
	@ApiField("login_record_d_t_o")
	private List<LoginRecordDTO> loginRecords;

	public void setLoginRecords(List<LoginRecordDTO> loginRecords) {
		this.loginRecords = loginRecords;
	}
	public List<LoginRecordDTO> getLoginRecords( ) {
		return this.loginRecords;
	}

}
