package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.store.codelist.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 15:27:26
 */
public class AlipayCommerceMedicalStoreCodelistGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8231798943898686399L;

	/** 
	 * 门店编码数组
	 */
	@ApiListField("records")
	@ApiField("string")
	private List<String> records;

	/** 
	 * 一共有多少个成功入驻的门店编码
	 */
	@ApiField("total")
	private Long total;

	public void setRecords(List<String> records) {
		this.records = records;
	}
	public List<String> getRecords( ) {
		return this.records;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
