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
 * @since 1.0, 2022-12-08 07:52:03
 */
public class AntMerchantExpandIndirectActivityCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8691357396844196289L;

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
