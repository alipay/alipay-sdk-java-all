package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约详情信息
 *
 * @author auto create
 * @since 1.0, 2020-03-05 22:25:40
 */
public class ZmContractDetail extends AlipayObject {

	private static final long serialVersionUID = 4387917873794164928L;

	/**
	 * 取消的操作主体 用于区分是系统取消还是用户主动取消
	 */
	@ApiField("cancel_operator")
	private String cancelOperator;

	/**
	 * 是否支持取消
	 */
	@ApiField("cancel_supported")
	private Boolean cancelSupported;

	/**
	 * 约定内容描述
	 */
	@ApiField("contract_content")
	private String contractContent;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合约主体描述，用于呈现支付端内约定详情中的主体描述
	 */
	@ApiField("contract_principal_desc")
	private String contractPrincipalDesc;

	/**
	 * 合约主体图片链接
	 */
	@ApiField("contract_principal_logo")
	private String contractPrincipalLogo;

	/**
	 * 合约状态 INIT:初始化,待应约状态 EFFECT:生效 COMPLETE:完结 CLOSE:关闭 INVALID:失效
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 事件详情，事件可以为打卡事件等所有履约推进事件
	 */
	@ApiListField("event_detail")
	@ApiField("bcc_event_detail")
	private List<BccEventDetail> eventDetail;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 去履约完成时点击的链接地址
	 */
	@ApiField("fufilment_callback_url")
	private String fufilmentCallbackUrl;

	/**
	 * 履约需要完成次数，如看直播一次，关注店铺一次
	 */
	@ApiField("fufilment_cnt")
	private Long fufilmentCnt;

	/**
	 * 履约需要完成的事项描述
	 */
	@ApiField("fufilment_desc")
	private String fufilmentDesc;

	/**
	 * 合约周期结束时间 fufilment_period_type=default时必选
	 */
	@ApiField("fufilment_end_time")
	private String fufilmentEndTime;

	/**
	 * 履约周期类型(default:默认有限周期，需要填写开始结束时间)
	 */
	@ApiField("fufilment_period_type")
	private String fufilmentPeriodType;

	/**
	 * 合约周期开始时间 fufilment_period_type=default时必选
	 */
	@ApiField("fufilment_start_time")
	private String fufilmentStartTime;

	/**
	 * 应约时间
	 */
	@ApiField("gmt_accept")
	private String gmtAccept;

	/**
	 * 合约取消时间
	 */
	@ApiField("gmt_cancel")
	private String gmtCancel;

	/**
	 * 逾期时间
	 */
	@ApiField("gmt_due")
	private String gmtDue;

	/**
	 * 合约完结时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 合约生效时间
	 */
	@ApiField("gmt_valid")
	private String gmtValid;

	/**
	 * 事项结束时间
	 */
	@ApiField("item_end_time")
	private String itemEndTime;

	/**
	 * 事项号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 事项开始时间
	 */
	@ApiField("item_start_time")
	private String itemStartTime;

	/**
	 * 发约创建者主体id(商户pid/用户芝麻id/支付宝用户id/淘宝用户id)
	 */
	@ApiField("offer_creater_id")
	private String offerCreaterId;

	/**
	 * 发约创建者名称,对应： 商户名称 芝麻用户名称 支付宝用户名称 淘宝用户名称
	 */
	@ApiField("offer_creater_name")
	private String offerCreaterName;

	/**
	 * 发约创建者类型： MERCHANT:商户 ZHIMA_ROLE:芝麻用户 ALIPAY_ROLE:支付宝用户 TAOBAO_ROLE:淘宝用户
	 */
	@ApiField("offer_creater_type")
	private String offerCreaterType;

	/**
	 * 发约单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部内容号，对应标的物id，如直播号，电影id，店铺id，节目id等
	 */
	@ApiField("out_content_no")
	private String outContentNo;

	/**
	 * 应约主体id
	 */
	@ApiField("sign_principal_id")
	private String signPrincipalId;

	/**
	 * 应约者类型:ZHIMA_ROLE:芝麻用户 ALIPAY_ROLE:支付宝用户 TAOBAO_ROLE:淘宝用户
	 */
	@ApiField("sign_principal_type")
	private String signPrincipalType;

	/**
	 * 事项下标的信息
	 */
	@ApiListField("subjects")
	@ApiField("bcc_subject_detail")
	private List<BccSubjectDetail> subjects;

	public String getCancelOperator() {
		return this.cancelOperator;
	}
	public void setCancelOperator(String cancelOperator) {
		this.cancelOperator = cancelOperator;
	}

	public Boolean getCancelSupported() {
		return this.cancelSupported;
	}
	public void setCancelSupported(Boolean cancelSupported) {
		this.cancelSupported = cancelSupported;
	}

	public String getContractContent() {
		return this.contractContent;
	}
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractPrincipalDesc() {
		return this.contractPrincipalDesc;
	}
	public void setContractPrincipalDesc(String contractPrincipalDesc) {
		this.contractPrincipalDesc = contractPrincipalDesc;
	}

	public String getContractPrincipalLogo() {
		return this.contractPrincipalLogo;
	}
	public void setContractPrincipalLogo(String contractPrincipalLogo) {
		this.contractPrincipalLogo = contractPrincipalLogo;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public List<BccEventDetail> getEventDetail() {
		return this.eventDetail;
	}
	public void setEventDetail(List<BccEventDetail> eventDetail) {
		this.eventDetail = eventDetail;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFufilmentCallbackUrl() {
		return this.fufilmentCallbackUrl;
	}
	public void setFufilmentCallbackUrl(String fufilmentCallbackUrl) {
		this.fufilmentCallbackUrl = fufilmentCallbackUrl;
	}

	public Long getFufilmentCnt() {
		return this.fufilmentCnt;
	}
	public void setFufilmentCnt(Long fufilmentCnt) {
		this.fufilmentCnt = fufilmentCnt;
	}

	public String getFufilmentDesc() {
		return this.fufilmentDesc;
	}
	public void setFufilmentDesc(String fufilmentDesc) {
		this.fufilmentDesc = fufilmentDesc;
	}

	public String getFufilmentEndTime() {
		return this.fufilmentEndTime;
	}
	public void setFufilmentEndTime(String fufilmentEndTime) {
		this.fufilmentEndTime = fufilmentEndTime;
	}

	public String getFufilmentPeriodType() {
		return this.fufilmentPeriodType;
	}
	public void setFufilmentPeriodType(String fufilmentPeriodType) {
		this.fufilmentPeriodType = fufilmentPeriodType;
	}

	public String getFufilmentStartTime() {
		return this.fufilmentStartTime;
	}
	public void setFufilmentStartTime(String fufilmentStartTime) {
		this.fufilmentStartTime = fufilmentStartTime;
	}

	public String getGmtAccept() {
		return this.gmtAccept;
	}
	public void setGmtAccept(String gmtAccept) {
		this.gmtAccept = gmtAccept;
	}

	public String getGmtCancel() {
		return this.gmtCancel;
	}
	public void setGmtCancel(String gmtCancel) {
		this.gmtCancel = gmtCancel;
	}

	public String getGmtDue() {
		return this.gmtDue;
	}
	public void setGmtDue(String gmtDue) {
		this.gmtDue = gmtDue;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(String gmtValid) {
		this.gmtValid = gmtValid;
	}

	public String getItemEndTime() {
		return this.itemEndTime;
	}
	public void setItemEndTime(String itemEndTime) {
		this.itemEndTime = itemEndTime;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemStartTime() {
		return this.itemStartTime;
	}
	public void setItemStartTime(String itemStartTime) {
		this.itemStartTime = itemStartTime;
	}

	public String getOfferCreaterId() {
		return this.offerCreaterId;
	}
	public void setOfferCreaterId(String offerCreaterId) {
		this.offerCreaterId = offerCreaterId;
	}

	public String getOfferCreaterName() {
		return this.offerCreaterName;
	}
	public void setOfferCreaterName(String offerCreaterName) {
		this.offerCreaterName = offerCreaterName;
	}

	public String getOfferCreaterType() {
		return this.offerCreaterType;
	}
	public void setOfferCreaterType(String offerCreaterType) {
		this.offerCreaterType = offerCreaterType;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutContentNo() {
		return this.outContentNo;
	}
	public void setOutContentNo(String outContentNo) {
		this.outContentNo = outContentNo;
	}

	public String getSignPrincipalId() {
		return this.signPrincipalId;
	}
	public void setSignPrincipalId(String signPrincipalId) {
		this.signPrincipalId = signPrincipalId;
	}

	public String getSignPrincipalType() {
		return this.signPrincipalType;
	}
	public void setSignPrincipalType(String signPrincipalType) {
		this.signPrincipalType = signPrincipalType;
	}

	public List<BccSubjectDetail> getSubjects() {
		return this.subjects;
	}
	public void setSubjects(List<BccSubjectDetail> subjects) {
		this.subjects = subjects;
	}

}
