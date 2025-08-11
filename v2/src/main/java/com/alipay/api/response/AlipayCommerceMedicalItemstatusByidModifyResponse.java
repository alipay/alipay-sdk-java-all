package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemIdStatusFailInfo;
import com.alipay.api.domain.ItemIdStatusSuccessInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemstatus.byid.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-18 15:42:26
 */
public class AlipayCommerceMedicalItemstatusByidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7162693456769251339L;

	/** 
	 * 上下架操作执行失败记录
	 */
	@ApiListField("fail_list")
	@ApiField("item_id_status_fail_info")
	private List<ItemIdStatusFailInfo> failList;

	/** 
	 * 上下架操作执行成功记录
	 */
	@ApiListField("succ_list")
	@ApiField("item_id_status_success_info")
	private List<ItemIdStatusSuccessInfo> succList;

	public void setFailList(List<ItemIdStatusFailInfo> failList) {
		this.failList = failList;
	}
	public List<ItemIdStatusFailInfo> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemIdStatusSuccessInfo> succList) {
		this.succList = succList;
	}
	public List<ItemIdStatusSuccessInfo> getSuccList( ) {
		return this.succList;
	}

}
