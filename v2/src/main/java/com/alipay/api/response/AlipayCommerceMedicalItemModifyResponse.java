package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemUpdateFailInfoDTO;
import com.alipay.api.domain.ItemUpdateSuccessInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 09:47:27
 */
public class AlipayCommerceMedicalItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4141936889871272479L;

	/** 
	 * 失败信息
	 */
	@ApiListField("fail_list")
	@ApiField("item_update_fail_info_d_t_o")
	private List<ItemUpdateFailInfoDTO> failList;

	/** 
	 * 成功信息
	 */
	@ApiListField("succ_list")
	@ApiField("item_update_success_info_d_t_o")
	private List<ItemUpdateSuccessInfoDTO> succList;

	public void setFailList(List<ItemUpdateFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<ItemUpdateFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemUpdateSuccessInfoDTO> succList) {
		this.succList = succList;
	}
	public List<ItemUpdateSuccessInfoDTO> getSuccList( ) {
		return this.succList;
	}

}
