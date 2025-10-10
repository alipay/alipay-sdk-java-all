package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemCodeStatusFailInfo;
import com.alipay.api.domain.ItemCodeStatusSuccessInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemstatus.bycode.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-18 15:42:26
 */
public class AlipayCommerceMedicalItemstatusBycodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4855258996776396847L;

	/** 
	 * 上下架操作执行失败信息
	 */
	@ApiListField("fail_list")
	@ApiField("item_code_status_fail_info")
	private List<ItemCodeStatusFailInfo> failList;

	/** 
	 * 上下架执行成功的记录
	 */
	@ApiListField("succ_list")
	@ApiField("item_code_status_success_info")
	private List<ItemCodeStatusSuccessInfo> succList;

	public void setFailList(List<ItemCodeStatusFailInfo> failList) {
		this.failList = failList;
	}
	public List<ItemCodeStatusFailInfo> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemCodeStatusSuccessInfo> succList) {
		this.succList = succList;
	}
	public List<ItemCodeStatusSuccessInfo> getSuccList( ) {
		return this.succList;
	}

}
