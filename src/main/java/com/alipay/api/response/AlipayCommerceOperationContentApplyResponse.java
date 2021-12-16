package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OperationExtDataModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.content.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-14 16:27:45
 */
public class AlipayCommerceOperationContentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6181263911557195544L;

	/** 
	 * 运营扩展数据 .
	 */
	@ApiField("ext_data")
	private OperationExtDataModel extData;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 申请记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 申请的内容相关的下游数据 ID ，比如 发奖对应奖品流水 id .
	 */
	@ApiField("target_id")
	private String targetId;

	public void setExtData(OperationExtDataModel extData) {
		this.extData = extData;
	}
	public OperationExtDataModel getExtData( ) {
		return this.extData;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getTargetId( ) {
		return this.targetId;
	}

}
