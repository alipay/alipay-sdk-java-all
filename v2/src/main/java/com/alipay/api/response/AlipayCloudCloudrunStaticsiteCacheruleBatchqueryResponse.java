package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CacheRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.cacherule.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 14:59:43
 */
public class AlipayCloudCloudrunStaticsiteCacheruleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1513639446861974831L;

	/** 
	 * 缓存配置列表
	 */
	@ApiListField("cacherule_list")
	@ApiField("cache_rule")
	private List<CacheRule> cacheruleList;

	public void setCacheruleList(List<CacheRule> cacheruleList) {
		this.cacheruleList = cacheruleList;
	}
	public List<CacheRule> getCacheruleList( ) {
		return this.cacheruleList;
	}

}
