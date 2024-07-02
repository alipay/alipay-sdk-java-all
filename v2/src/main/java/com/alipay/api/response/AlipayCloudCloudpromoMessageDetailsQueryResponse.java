package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SmsSendDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.message.details.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:57
 */
public class AlipayCloudCloudpromoMessageDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1764556876113474585L;

	/** 
	 * 短信发送明细。
	 */
	@ApiListField("sms_send_detail")
	@ApiField("sms_send_detail")
	private List<SmsSendDetail> smsSendDetail;

	/** 
	 * 短信发送成功条数
	 */
	@ApiField("success_count")
	private String successCount;

	/** 
	 * 短信发送总条数。
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setSmsSendDetail(List<SmsSendDetail> smsSendDetail) {
		this.smsSendDetail = smsSendDetail;
	}
	public List<SmsSendDetail> getSmsSendDetail( ) {
		return this.smsSendDetail;
	}

	public void setSuccessCount(String successCount) {
		this.successCount = successCount;
	}
	public String getSuccessCount( ) {
		return this.successCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
