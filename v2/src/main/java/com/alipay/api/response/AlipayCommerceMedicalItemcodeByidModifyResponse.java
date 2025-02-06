package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemUpdatedByIdFailVO;
import com.alipay.api.domain.UpdateCodeByIdSuccessInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemcode.byid.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 17:07:24
 */
public class AlipayCommerceMedicalItemcodeByidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1258244381156636758L;

	/** 
	 * 失败列表
	 */
	@ApiField("fail_list")
	private ItemUpdatedByIdFailVO failList;

	/** 
	 * 成功列表
	 */
	@ApiListField("succ_list")
	@ApiField("update_code_by_id_success_info")
	private List<UpdateCodeByIdSuccessInfo> succList;

	public void setFailList(ItemUpdatedByIdFailVO failList) {
		this.failList = failList;
	}
	public ItemUpdatedByIdFailVO getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<UpdateCodeByIdSuccessInfo> succList) {
		this.succList = succList;
	}
	public List<UpdateCodeByIdSuccessInfo> getSuccList( ) {
		return this.succList;
	}

}
