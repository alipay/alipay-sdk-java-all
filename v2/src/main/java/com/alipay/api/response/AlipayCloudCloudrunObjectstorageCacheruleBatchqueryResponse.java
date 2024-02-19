package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CacheRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.cacherule.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 15:41:07
 */
public class AlipayCloudCloudrunObjectstorageCacheruleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7585679842539339949L;

	/** 
	 * 缓存列表
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
