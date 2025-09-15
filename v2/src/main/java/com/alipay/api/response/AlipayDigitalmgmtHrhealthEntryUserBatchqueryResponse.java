package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EntryHealthPersonInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrhealth.entry.user.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-25 15:02:04
 */
public class AlipayDigitalmgmtHrhealthEntryUserBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4712145533185625443L;

	/** 
	 * 候选人信息列表，根据主数据中最近要入职的候选人数据加工获取，数组数据，供应商拿到参数后进行初始化，返回值为空时代表无最近入职的候选人
	 */
	@ApiListField("entry_person_list")
	@ApiField("entry_health_person_info")
	private List<EntryHealthPersonInfo> entryPersonList;

	public void setEntryPersonList(List<EntryHealthPersonInfo> entryPersonList) {
		this.entryPersonList = entryPersonList;
	}
	public List<EntryHealthPersonInfo> getEntryPersonList( ) {
		return this.entryPersonList;
	}

}
