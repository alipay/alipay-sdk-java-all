package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料生产/配送/更正处理结果
 *
 * @author auto create
 * @since 1.0, 2019-01-09 20:29:52
 */
public class AssetResult extends AlipayObject {

	private static final long serialVersionUID = 4711181622225257656L;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 批次号，分批反馈时用
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * openapi 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * AssetSubFeedbackInfo 列表
	 */
	@ApiListField("sub_feedback_infos")
	@ApiField("asset_sub_feedback_info")
	private List<AssetSubFeedbackInfo> subFeedbackInfos;

	/**
	 * 是否处理成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AssetSubFeedbackInfo> getSubFeedbackInfos() {
		return this.subFeedbackInfos;
	}
	public void setSubFeedbackInfos(List<AssetSubFeedbackInfo> subFeedbackInfos) {
		this.subFeedbackInfos = subFeedbackInfos;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
