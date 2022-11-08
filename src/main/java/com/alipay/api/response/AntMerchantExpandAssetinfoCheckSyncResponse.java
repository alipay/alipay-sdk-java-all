package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetSubFeedbackInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.check.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-31 10:06:47
 */
public class AntMerchantExpandAssetinfoCheckSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8253297361883227211L;

	/** 
	 * 返回的批次号和请求的相同
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 供应商名下无此分配记录,错误信息
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 具体的错误信息
	 */
	@ApiListField("sub_check_infos")
	@ApiField("asset_sub_feedback_info")
	private List<AssetSubFeedbackInfo> subCheckInfos;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorDesc( ) {
		return this.errorDesc;
	}

	public void setSubCheckInfos(List<AssetSubFeedbackInfo> subCheckInfos) {
		this.subCheckInfos = subCheckInfos;
	}
	public List<AssetSubFeedbackInfo> getSubCheckInfos( ) {
		return this.subCheckInfos;
	}

}
