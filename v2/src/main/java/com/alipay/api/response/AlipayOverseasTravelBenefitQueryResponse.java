package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 14:41:59
 */
public class AlipayOverseasTravelBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2494476787174253833L;

	/** 
	 * 流量端生成的权益id,只在权益同步成功时才返回
	 */
	@ApiField("client_benefit_id")
	private String clientBenefitId;

	/** 
	 * 扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 同步处理状态，合法取值：
PROCESSING：处理中
SUCCESS：处理成功
FAIL：处理失败
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public void setClientBenefitId(String clientBenefitId) {
		this.clientBenefitId = clientBenefitId;
	}
	public String getClientBenefitId( ) {
		return this.clientBenefitId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
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
