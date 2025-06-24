package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemUpdateFailInfoDTO;
import com.alipay.api.domain.ItemBatchDeleteSuccessInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.batch.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 10:09:03
 */
public class AlipayCommerceMedicalItemBatchDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2392191542173239624L;

	/** 
	 * 批量删除商品, 执行失败信息
	 */
	@ApiListField("fail_list")
	@ApiField("item_update_fail_info_d_t_o")
	private List<ItemUpdateFailInfoDTO> failList;

	/** 
	 * 批量删除商品, 执行成功信息
	 */
	@ApiListField("succ_list")
	@ApiField("item_batch_delete_success_info_d_t_o")
	private List<ItemBatchDeleteSuccessInfoDTO> succList;

	public void setFailList(List<ItemUpdateFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<ItemUpdateFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemBatchDeleteSuccessInfoDTO> succList) {
		this.succList = succList;
	}
	public List<ItemBatchDeleteSuccessInfoDTO> getSuccList( ) {
		return this.succList;
	}

}
