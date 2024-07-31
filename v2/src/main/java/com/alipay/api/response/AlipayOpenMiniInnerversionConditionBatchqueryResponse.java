package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniVersionBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.condition.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:43:23
 */
public class AlipayOpenMiniInnerversionConditionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3827758434172577161L;

	/** 
	 * 小程序版本信息
	 */
	@ApiListField("mini_version_base_info_list")
	@ApiField("mini_version_base_info")
	private List<MiniVersionBaseInfo> miniVersionBaseInfoList;

	public void setMiniVersionBaseInfoList(List<MiniVersionBaseInfo> miniVersionBaseInfoList) {
		this.miniVersionBaseInfoList = miniVersionBaseInfoList;
	}
	public List<MiniVersionBaseInfo> getMiniVersionBaseInfoList( ) {
		return this.miniVersionBaseInfoList;
	}

}
