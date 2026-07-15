package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceTagSyncFailInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthmanagem.servicetag.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-12 15:32:55
 */
public class AlipayCommerceMedicalHealthmanagemServicetagSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6379795631177478567L;

	/** 
	 * null
	 */
	@ApiListField("fail_list")
	@ApiField("service_tag_sync_fail_info_d_t_o")
	private List<ServiceTagSyncFailInfoDTO> failList;

	/** 
	 * null
	 */
	@ApiListField("succ_list")
	@ApiField("string")
	private List<String> succList;

	public void setFailList(List<ServiceTagSyncFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<ServiceTagSyncFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<String> succList) {
		this.succList = succList;
	}
	public List<String> getSuccList( ) {
		return this.succList;
	}

}
