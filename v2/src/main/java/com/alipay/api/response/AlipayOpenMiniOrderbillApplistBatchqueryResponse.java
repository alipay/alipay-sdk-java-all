package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.orderbill.applist.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-26 13:52:08
 */
public class AlipayOpenMiniOrderbillApplistBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8659948439813372315L;

	/** 
	 * 小程序列表详情
	 */
	@ApiListField("app_list")
	@ApiField("app_base_info")
	private List<AppBaseInfo> appList;

	/** 
	 * 总条数，在业务账单有出账记录的小程序总数
	 */
	@ApiField("total")
	private Long total;

	public void setAppList(List<AppBaseInfo> appList) {
		this.appList = appList;
	}
	public List<AppBaseInfo> getAppList( ) {
		return this.appList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
