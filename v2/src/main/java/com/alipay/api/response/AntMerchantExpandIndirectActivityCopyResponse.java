package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityCopyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.activity.copy response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:14:22
 */
public class AntMerchantExpandIndirectActivityCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3265616636872178632L;

	/** 
	 * 活动权益复制结果
	 */
	@ApiListField("copy_result")
	@ApiField("activity_copy_result")
	private List<ActivityCopyResult> copyResult;

	public void setCopyResult(List<ActivityCopyResult> copyResult) {
		this.copyResult = copyResult;
	}
	public List<ActivityCopyResult> getCopyResult( ) {
		return this.copyResult;
	}

}
