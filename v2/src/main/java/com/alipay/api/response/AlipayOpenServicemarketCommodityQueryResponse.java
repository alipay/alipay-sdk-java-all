package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.commodity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:37:17
 */
public class AlipayOpenServicemarketCommodityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5813331328664795352L;

	/** 
	 * 热点URL
	 */
	@ApiField("app_hot_logo")
	private String appHotLogo;

	/** 
	 * 插件服务审核备注
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/** 
	 * 授权文件url
	 */
	@ApiField("authorization_file")
	private String authorizationFile;

	/** 
	 * 插件应用类型
	 */
	@ApiField("biz_type_code")
	private String bizTypeCode;

	/** 
	 * CARLIFE("车主服务", "001"),
MEDICALCARE("医疗服务", "003"),
CITYSERVICE("城市服务", "004"),
MOBILE_OPERATOR("运营商服务", "005");
	 */
	@ApiField("category_code")
	private String categoryCode;

	/** 
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 服务归属  0-自主开发  1-委托开发者
	 */
	@ApiField("commodity_affiliation")
	private String commodityAffiliation;

	/** 
	 * 服务插件id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/** 
	 * 服务商联系人
	 */
	@ApiField("contactor")
	private String contactor;

	/** 
	 * 服务创建时间
	 */
	@ApiField("create_date")
	private String createDate;

	/** 
	 * 服务logo地址
	 */
	@ApiField("log_url")
	private String logUrl;

	/** 
	 * 移动端服务配置地址
	 */
	@ApiField("mobile_visiturl")
	private String mobileVisiturl;

	/** 
	 * 服务创建者名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 服务商联系人手机号
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * ONLINE-已上架
OFFLINE-待上架
AUDIT-审核中
AUDIT_REJECT-审核拒绝
AUDIT_OFFLINE-已下架
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 0表示BD不可审核   1表示BD可以审核
	 */
	@ApiField("sub_status")
	private String subStatus;

	/** 
	 * 服务插件相关描述信息
	 */
	@ApiField("subtitle")
	private String subtitle;

	/** 
	 * 应用验收说明
	 */
	@ApiField("test_detail")
	private String testDetail;

	/** 
	 * 压力测试报告url
	 */
	@ApiField("test_report")
	private String testReport;

	/** 
	 * 服务插件名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 用户指南url
	 */
	@ApiField("user_guide")
	private String userGuide;

	/** 
	 * 服务创建者ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAppHotLogo(String appHotLogo) {
		this.appHotLogo = appHotLogo;
	}
	public String getAppHotLogo( ) {
		return this.appHotLogo;
	}

	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}
	public String getAuditMemo( ) {
		return this.auditMemo;
	}

	public void setAuthorizationFile(String authorizationFile) {
		this.authorizationFile = authorizationFile;
	}
	public String getAuthorizationFile( ) {
		return this.authorizationFile;
	}

	public void setBizTypeCode(String bizTypeCode) {
		this.bizTypeCode = bizTypeCode;
	}
	public String getBizTypeCode( ) {
		return this.bizTypeCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryCode( ) {
		return this.categoryCode;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCommodityAffiliation(String commodityAffiliation) {
		this.commodityAffiliation = commodityAffiliation;
	}
	public String getCommodityAffiliation( ) {
		return this.commodityAffiliation;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityId( ) {
		return this.commodityId;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
	}
	public String getContactor( ) {
		return this.contactor;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateDate( ) {
		return this.createDate;
	}

	public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}
	public String getLogUrl( ) {
		return this.logUrl;
	}

	public void setMobileVisiturl(String mobileVisiturl) {
		this.mobileVisiturl = mobileVisiturl;
	}
	public String getMobileVisiturl( ) {
		return this.mobileVisiturl;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public String getSubStatus( ) {
		return this.subStatus;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getSubtitle( ) {
		return this.subtitle;
	}

	public void setTestDetail(String testDetail) {
		this.testDetail = testDetail;
	}
	public String getTestDetail( ) {
		return this.testDetail;
	}

	public void setTestReport(String testReport) {
		this.testReport = testReport;
	}
	public String getTestReport( ) {
		return this.testReport;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setUserGuide(String userGuide) {
		this.userGuide = userGuide;
	}
	public String getUserGuide( ) {
		return this.userGuide;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
