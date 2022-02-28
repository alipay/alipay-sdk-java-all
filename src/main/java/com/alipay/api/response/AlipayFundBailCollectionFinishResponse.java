package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.bail.collection.finish response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-12 14:32:46
 */
public class AlipayFundBailCollectionFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8735978879273727643L;

	/** 
	 * 当result_code为FAIL时，对应的错误码
	 */
	@ApiField("biz_error")
	private String bizError;

	/** 
	 * 支付宝内部委托单号，根据外部委托号out_collection_no查询，仅当存在对应委托单时返回
	 */
	@ApiField("collection_no")
	private String collectionNo;

	/** 
	 * 业务扩展参数，json格式
	 */
	@ApiField("extra_param")
	private String extraParam;

	/** 
	 * 外部委托号
	 */
	@ApiField("out_collection_no")
	private String outCollectionNo;

	/** 
	 * 销售产品码，用于接入保证金业务，本字段取值固定为BAIL_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 处理结果码。处理成功：SUCCESS，处理失败：FAIL
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setBizError(String bizError) {
		this.bizError = bizError;
	}
	public String getBizError( ) {
		return this.bizError;
	}

	public void setCollectionNo(String collectionNo) {
		this.collectionNo = collectionNo;
	}
	public String getCollectionNo( ) {
		return this.collectionNo;
	}

	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}
	public String getExtraParam( ) {
		return this.extraParam;
	}

	public void setOutCollectionNo(String outCollectionNo) {
		this.outCollectionNo = outCollectionNo;
	}
	public String getOutCollectionNo( ) {
		return this.outCollectionNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
