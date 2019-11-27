package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeclareRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.acquire.customs.query.depre response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasAcquireCustomsQueryDepreResponse extends AlipayResponse {

	private static final long serialVersionUID = 5164747793872296147L;

	/** 
	 * 未找到记录的报关单列表
	 */
	@ApiListField("not_found")
	@ApiField("string")
	private List<String> notFound;

	/** 
	 * 匹配到的报关单列表
	 */
	@ApiListField("records")
	@ApiField("declare_record")
	private List<DeclareRecord> records;

	public void setNotFound(List<String> notFound) {
		this.notFound = notFound;
	}
	public List<String> getNotFound( ) {
		return this.notFound;
	}

	public void setRecords(List<DeclareRecord> records) {
		this.records = records;
	}
	public List<DeclareRecord> getRecords( ) {
		return this.records;
	}

}
