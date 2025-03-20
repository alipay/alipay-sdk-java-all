package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:37
 */
public class AlipayOpenDataServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7346242458498179852L;

	/** 
	 * 返回结果
	 */
	@ApiListField("group_records")
	@ApiField("group_record")
	private List<GroupRecord> groupRecords;

	/** 
	 * 是否成功
true：成功
false:失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setGroupRecords(List<GroupRecord> groupRecords) {
		this.groupRecords = groupRecords;
	}
	public List<GroupRecord> getGroupRecords( ) {
		return this.groupRecords;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
