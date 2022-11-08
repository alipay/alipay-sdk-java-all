package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系产品能力申请
 *
 * @author auto create
 * @since 1.0, 2022-07-13 10:23:08
 */
public class AlipayBusinessRelationProductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6715915711866742832L;

	/**
	 * 申请目标信息
	 */
	@ApiField("apply_target_info")
	private BusinessRelationApplyTargetInfo applyTargetInfo;

	/**
	 * 附件信息，当产品码为门店经营分析数据产品码时，此项必填
	 */
	@ApiField("attachment_info")
	private BusinessRelationAttachmentInfo attachmentInfo;

	/**
	 * 内部业务编号,当operation_type为更新操作时，此项必填
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 商业关系id，如：商圈mallid
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 操作类型，CREAE:创建，UPDATE:更新
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，标识具体的产品能力，门店经营数据产品码：SHOP_TRADE_ANALYSIS_DATA
	 */
	@ApiField("product_code")
	private String productCode;

	public BusinessRelationApplyTargetInfo getApplyTargetInfo() {
		return this.applyTargetInfo;
	}
	public void setApplyTargetInfo(BusinessRelationApplyTargetInfo applyTargetInfo) {
		this.applyTargetInfo = applyTargetInfo;
	}

	public BusinessRelationAttachmentInfo getAttachmentInfo() {
		return this.attachmentInfo;
	}
	public void setAttachmentInfo(BusinessRelationAttachmentInfo attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
