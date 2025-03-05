package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuCodeUpdateFailInfoDTO;
import com.alipay.api.domain.SkuCodeUpdateSuccessInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.sku.code.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 11:17:23
 */
public class AlipayCommerceMedicalSkuCodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2683265466826822597L;

	/** 
	 * sku信息更新失败列表，包含skuCode和失败提示信息
	 */
	@ApiListField("fail_list")
	@ApiField("sku_code_update_fail_info_d_t_o")
	private List<SkuCodeUpdateFailInfoDTO> failList;

	/** 
	 * sku信息更新成功列表，包含skuCode
	 */
	@ApiListField("succ_list")
	@ApiField("sku_code_update_success_info_d_t_o")
	private List<SkuCodeUpdateSuccessInfoDTO> succList;

	public void setFailList(List<SkuCodeUpdateFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<SkuCodeUpdateFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<SkuCodeUpdateSuccessInfoDTO> succList) {
		this.succList = succList;
	}
	public List<SkuCodeUpdateSuccessInfoDTO> getSuccList( ) {
		return this.succList;
	}

}
