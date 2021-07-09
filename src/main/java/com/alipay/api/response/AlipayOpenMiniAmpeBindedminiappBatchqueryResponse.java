package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BindedMiniAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.bindedminiapp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-14 14:21:51
 */
public class AlipayOpenMiniAmpeBindedminiappBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2216318535636342739L;

	/** 
	 * 绑定的小程序信息列表
	 */
	@ApiListField("binded_mini_app_list")
	@ApiField("binded_mini_app_info")
	private List<BindedMiniAppInfo> bindedMiniAppList;

	/** 
	 * 已绑定小程序的总个数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setBindedMiniAppList(List<BindedMiniAppInfo> bindedMiniAppList) {
		this.bindedMiniAppList = bindedMiniAppList;
	}
	public List<BindedMiniAppInfo> getBindedMiniAppList( ) {
		return this.bindedMiniAppList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
