package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PreconsultResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.preconsult.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class AlipayCommerceAcommunicationCreditphonePreconsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262862984963984324L;

	/** 
	 * 预咨询状态
	 */
	@ApiField("consult_status")
	private String consultStatus;

	/** 
	 * null
	 */
	@ApiListField("preconsult_result_list")
	@ApiField("preconsult_result")
	private List<PreconsultResult> preconsultResultList;

	/** 
	 * 预鉴权请求流水号（全局唯一）
	 */
	@ApiField("request_no")
	private String requestNo;

	public void setConsultStatus(String consultStatus) {
		this.consultStatus = consultStatus;
	}
	public String getConsultStatus( ) {
		return this.consultStatus;
	}

	public void setPreconsultResultList(List<PreconsultResult> preconsultResultList) {
		this.preconsultResultList = preconsultResultList;
	}
	public List<PreconsultResult> getPreconsultResultList( ) {
		return this.preconsultResultList;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

}
