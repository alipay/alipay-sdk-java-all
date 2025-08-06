package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用招投标报告创建请求
 *
 * @author auto create
 * @since 1.0, 2025-07-02 16:55:17
 */
public class ZhimaCreditEpZtbReportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3811339244623966212L;

	/**
	 * 招标类型，属于多种类型的话，用-拼接。例如采购中标-工程中标-服务中标
	 */
	@ApiField("bid_type")
	private String bidType;

	/**
	 * 投标企业统一社会信用代码
	 */
	@ApiField("bidder_ep_cert_no")
	private String bidderEpCertNo;

	/**
	 * 投标企业全称
	 */
	@ApiField("bidder_ep_name")
	private String bidderEpName;

	/**
	 * 招标单位统一社会信用代码或营业执照注册号
	 */
	@ApiField("bidding_ep_cert_no")
	private String biddingEpCertNo;

	/**
	 * 招标单位企业全称
	 */
	@ApiField("bidding_ep_name")
	private String biddingEpName;

	/**
	 * 合作方客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 招标信息标题标的物，多个用,隔开
	 */
	@ApiField("heading_object")
	private String headingObject;

	/**
	 * 报告类型。不传入默认为EP_ZTB_REPORT
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户唯一业务流水号，由大小写字母和数字构成。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 套餐类别
	 */
	@ApiField("pack_type")
	private String packType;

	/**
	 * 招标项目所在省市区国标编码，若获取不到，默认给编码值000000
	 */
	@ApiField("project_area_code")
	private String projectAreaCode;

	/**
	 * 招标项目所在省市区中文描述，以横线分隔，比如：XX省-XX市-XX区，针对港澳台，仅提供到省级别，如：香港特别行政区
	 */
	@ApiField("project_area_desc")
	private String projectAreaDesc;

	/**
	 * 招标信息项目预算，单位元
	 */
	@ApiField("project_budget")
	private String projectBudget;

	/**
	 * 招标项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 报告价格。单位人民币元
	 */
	@ApiField("report_amount")
	private String reportAmount;

	/**
	 * 受理场景码，由蚂蚁企业信用方分发提供，配置有误会返回参数错误
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 招标正文标的物
	 */
	@ApiField("text_object")
	private String textObject;

	public String getBidType() {
		return this.bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public String getBidderEpCertNo() {
		return this.bidderEpCertNo;
	}
	public void setBidderEpCertNo(String bidderEpCertNo) {
		this.bidderEpCertNo = bidderEpCertNo;
	}

	public String getBidderEpName() {
		return this.bidderEpName;
	}
	public void setBidderEpName(String bidderEpName) {
		this.bidderEpName = bidderEpName;
	}

	public String getBiddingEpCertNo() {
		return this.biddingEpCertNo;
	}
	public void setBiddingEpCertNo(String biddingEpCertNo) {
		this.biddingEpCertNo = biddingEpCertNo;
	}

	public String getBiddingEpName() {
		return this.biddingEpName;
	}
	public void setBiddingEpName(String biddingEpName) {
		this.biddingEpName = biddingEpName;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getHeadingObject() {
		return this.headingObject;
	}
	public void setHeadingObject(String headingObject) {
		this.headingObject = headingObject;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPackType() {
		return this.packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getProjectAreaCode() {
		return this.projectAreaCode;
	}
	public void setProjectAreaCode(String projectAreaCode) {
		this.projectAreaCode = projectAreaCode;
	}

	public String getProjectAreaDesc() {
		return this.projectAreaDesc;
	}
	public void setProjectAreaDesc(String projectAreaDesc) {
		this.projectAreaDesc = projectAreaDesc;
	}

	public String getProjectBudget() {
		return this.projectBudget;
	}
	public void setProjectBudget(String projectBudget) {
		this.projectBudget = projectBudget;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getReportAmount() {
		return this.reportAmount;
	}
	public void setReportAmount(String reportAmount) {
		this.reportAmount = reportAmount;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTextObject() {
		return this.textObject;
	}
	public void setTextObject(String textObject) {
		this.textObject = textObject;
	}

}
