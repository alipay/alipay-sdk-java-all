package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemUpdateByIdFailDTO;
import com.alipay.api.domain.ItemUpdateByIdSuccessDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.byid.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 18:17:26
 */
public class AlipayCommerceMedicalItemByidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2616588328984921913L;

	/** 
	 * 失败信息
	 */
	@ApiListField("fail_list")
	@ApiField("item_update_by_id_fail_d_t_o")
	private List<ItemUpdateByIdFailDTO> failList;

	/** 
	 * 成功信息
	 */
	@ApiListField("succ_list")
	@ApiField("item_update_by_id_success_d_t_o")
	private List<ItemUpdateByIdSuccessDTO> succList;

	public void setFailList(List<ItemUpdateByIdFailDTO> failList) {
		this.failList = failList;
	}
	public List<ItemUpdateByIdFailDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemUpdateByIdSuccessDTO> succList) {
		this.succList = succList;
	}
	public List<ItemUpdateByIdSuccessDTO> getSuccList( ) {
		return this.succList;
	}

}
