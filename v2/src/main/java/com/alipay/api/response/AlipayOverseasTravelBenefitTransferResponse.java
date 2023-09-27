package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.benefit.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:47:00
 */
public class AlipayOverseasTravelBenefitTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4683811488935159462L;

	/** 
	 * 权益详情链接
	 */
	@ApiField("benefit_detail_url")
	private String benefitDetailUrl;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * 同步失败错误码
	 */
	@ApiField("sync_fail_code")
	private String syncFailCode;

	/** 
	 * 同步失败原因
	 */
	@ApiField("sync_fail_reason")
	private String syncFailReason;

	/** 
	 * 同步处理状态，合法取值： PROCESSING：处理中 SUCCESS：处理成功 FAIL：处理失败
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public void setBenefitDetailUrl(String benefitDetailUrl) {
		this.benefitDetailUrl = benefitDetailUrl;
	}
	public String getBenefitDetailUrl( ) {
		return this.benefitDetailUrl;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

	public void setSyncFailCode(String syncFailCode) {
		this.syncFailCode = syncFailCode;
	}
	public String getSyncFailCode( ) {
		return this.syncFailCode;
	}

	public void setSyncFailReason(String syncFailReason) {
		this.syncFailReason = syncFailReason;
	}
	public String getSyncFailReason( ) {
		return this.syncFailReason;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	public String getSyncStatus( ) {
		return this.syncStatus;
	}

}
