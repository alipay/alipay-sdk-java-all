package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FailExternalSync;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.externalbillsync.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:29:14
 */
public class AlipayEbppCommunityExternalbillsyncUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8259953296332173834L;

	/** 
	 * 失败总数
	 */
	@ApiField("fail_count")
	private String failCount;

	/** 
	 * 失败列表，用于告知失败账单号和原因
	 */
	@ApiListField("fail_external_sync")
	@ApiField("fail_external_sync")
	private List<FailExternalSync> failExternalSync;

	/** 
	 * 成功总数
	 */
	@ApiField("success_count")
	private String successCount;

	public void setFailCount(String failCount) {
		this.failCount = failCount;
	}
	public String getFailCount( ) {
		return this.failCount;
	}

	public void setFailExternalSync(List<FailExternalSync> failExternalSync) {
		this.failExternalSync = failExternalSync;
	}
	public List<FailExternalSync> getFailExternalSync( ) {
		return this.failExternalSync;
	}

	public void setSuccessCount(String successCount) {
		this.successCount = successCount;
	}
	public String getSuccessCount( ) {
		return this.successCount;
	}

}
