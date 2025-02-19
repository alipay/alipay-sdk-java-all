package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuUpdateFailInfoDTO;
import com.alipay.api.domain.SkuUpdateSuccessInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.sku.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 11:17:23
 */
public class AlipayCommerceMedicalSkuModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7415192136558395488L;

	/** 
	 * sku信息更新失败列表，包含店内码，错误提示信息
	 */
	@ApiListField("fail_list")
	@ApiField("sku_update_fail_info_d_t_o")
	private List<SkuUpdateFailInfoDTO> failList;

	/** 
	 * sku信息更新成功列表，包含店内码
	 */
	@ApiListField("succ_list")
	@ApiField("sku_update_success_info_d_t_o")
	private List<SkuUpdateSuccessInfoDTO> succList;

	public void setFailList(List<SkuUpdateFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<SkuUpdateFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<SkuUpdateSuccessInfoDTO> succList) {
		this.succList = succList;
	}
	public List<SkuUpdateSuccessInfoDTO> getSuccList( ) {
		return this.succList;
	}

}
