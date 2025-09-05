package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemBatchDeleteByIdFailInfoDTO;
import com.alipay.api.domain.ItemBatchDeleteByIdSuccessInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.byid.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 18:22:27
 */
public class AlipayCommerceMedicalItemByidDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1198522615652618228L;

	/** 
	 * 批量删除商品, 执行失败信息-ById
	 */
	@ApiListField("fail_list")
	@ApiField("item_batch_delete_by_id_fail_info_d_t_o")
	private List<ItemBatchDeleteByIdFailInfoDTO> failList;

	/** 
	 * 批量删除商品, 执行成功信息-ById
	 */
	@ApiListField("succ_list")
	@ApiField("item_batch_delete_by_id_success_info_d_t_o")
	private List<ItemBatchDeleteByIdSuccessInfoDTO> succList;

	public void setFailList(List<ItemBatchDeleteByIdFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<ItemBatchDeleteByIdFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemBatchDeleteByIdSuccessInfoDTO> succList) {
		this.succList = succList;
	}
	public List<ItemBatchDeleteByIdSuccessInfoDTO> getSuccList( ) {
		return this.succList;
	}

}
