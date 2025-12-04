package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁售后单操作记录
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:18
 */
public class RentAftersaleOperationRecordVO extends AlipayObject {

	private static final long serialVersionUID = 3634461716593531235L;

	/**
	 * 申请售后的补充描述
	 */
	@ApiField("additional_description")
	private String additionalDescription;

	/**
	 * 用户申请售后的补充凭证，类型包括图片、视频等
	 */
	@ApiListField("additional_media_list")
	@ApiField("rent_aftersale_media_info_v_o")
	private List<RentAftersaleMediaInfoVO> additionalMediaList;

	/**
	 * 费用信息
	 */
	@ApiField("fund_info")
	private RentAftersaleFundInfoVO fundInfo;

	/**
	 * 商户下一步可操作类型列表
	 */
	@ApiListField("next_operation_type_list")
	@ApiField("string")
	private List<String> nextOperationTypeList;

	/**
	 * 商户操作的截止时间
	 */
	@ApiField("operation_deadline")
	private Date operationDeadline;

	/**
	 * 操作时间
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 申请售后的原因
	 */
	@ApiField("reason_description")
	private String reasonDescription;

	public String getAdditionalDescription() {
		return this.additionalDescription;
	}
	public void setAdditionalDescription(String additionalDescription) {
		this.additionalDescription = additionalDescription;
	}

	public List<RentAftersaleMediaInfoVO> getAdditionalMediaList() {
		return this.additionalMediaList;
	}
	public void setAdditionalMediaList(List<RentAftersaleMediaInfoVO> additionalMediaList) {
		this.additionalMediaList = additionalMediaList;
	}

	public RentAftersaleFundInfoVO getFundInfo() {
		return this.fundInfo;
	}
	public void setFundInfo(RentAftersaleFundInfoVO fundInfo) {
		this.fundInfo = fundInfo;
	}

	public List<String> getNextOperationTypeList() {
		return this.nextOperationTypeList;
	}
	public void setNextOperationTypeList(List<String> nextOperationTypeList) {
		this.nextOperationTypeList = nextOperationTypeList;
	}

	public Date getOperationDeadline() {
		return this.operationDeadline;
	}
	public void setOperationDeadline(Date operationDeadline) {
		this.operationDeadline = operationDeadline;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getReasonDescription() {
		return this.reasonDescription;
	}
	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

}
