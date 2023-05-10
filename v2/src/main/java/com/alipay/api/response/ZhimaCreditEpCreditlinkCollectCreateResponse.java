package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCreditLinkCreateQueryDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.collect.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:06:58
 */
public class ZhimaCreditEpCreditlinkCollectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1823518223791212235L;

	/** 
	 * 数据内容
	 */
	@ApiField("content")
	private EpCreditLinkCreateQueryDataInfo content;

	/** 
	 * INIT表示任务还在初始化状态，COLLECT表示任务在进行中，END表示任务处理完成，FAIL表示任务处理失败。
	 */
	@ApiField("data_status")
	private String dataStatus;

	/** 
	 * 请求数据类型。与传入值一致
	 */
	@ApiField("data_type")
	private String dataType;

	/** 
	 * 商户单号。与传入值一致
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	public void setContent(EpCreditLinkCreateQueryDataInfo content) {
		this.content = content;
	}
	public EpCreditLinkCreateQueryDataInfo getContent( ) {
		return this.content;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}
	public String getDataStatus( ) {
		return this.dataStatus;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDataType( ) {
		return this.dataType;
	}

	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}
	public String getMerchantRequestId( ) {
		return this.merchantRequestId;
	}

}
