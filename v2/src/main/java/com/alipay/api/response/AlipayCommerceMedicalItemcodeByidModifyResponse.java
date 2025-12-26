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
 * @since 1.0, 2025-03-18 15:42:25
 */
public class AlipayCommerceMedicalItemcodeByidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5788233934395832327L;

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
