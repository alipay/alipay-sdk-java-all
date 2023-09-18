package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.benefit.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:36:41
 */
public class AlipayOverseasTravelBenefitSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4537936817468776261L;

	/** 
	 * 流量端生成的权益id
	 */
	@ApiField("client_benefit_id")
	private String clientBenefitId;

	/** 
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * 同步结果状态
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

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	public String getSyncStatus( ) {
		return this.syncStatus;
	}

}
