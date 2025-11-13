package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemUpdatedByCodeFailVO;
import com.alipay.api.domain.UpdateCodeByCodeSuccessInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemcode.bycode.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-18 15:42:25
 */
public class AlipayCommerceMedicalItemcodeBycodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6441556978667828457L;

	/** 
	 * 失败列表
	 */
	@ApiListField("fail_list")
	@ApiField("item_updated_by_code_fail_v_o")
	private List<ItemUpdatedByCodeFailVO> failList;

	/** 
	 * 成功对象列表
	 */
	@ApiListField("succ_list")
	@ApiField("update_code_by_code_success_info")
	private List<UpdateCodeByCodeSuccessInfo> succList;

	public void setFailList(List<ItemUpdatedByCodeFailVO> failList) {
		this.failList = failList;
	}
	public List<ItemUpdatedByCodeFailVO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<UpdateCodeByCodeSuccessInfo> succList) {
		this.succList = succList;
	}
	public List<UpdateCodeByCodeSuccessInfo> getSuccList( ) {
		return this.succList;
	}

}
