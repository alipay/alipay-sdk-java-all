package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JobInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.jobcard.jobsupplier.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-26 17:32:57
 */
public class AlipayUserJobcardJobsupplierQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4322264643543538482L;

	/** 
	 * 企业基本信息。各参数含义
employ_nums：公司规模人数；
registered_captial：注册资金；
esta_date：成立时间；
nature：公私营性质；
	 */
	@ApiField("basic_info")
	private String basicInfo;

	/** 
	 * 企业福利补贴
	 */
	@ApiField("bonus_desc")
	private String bonusDesc;

	/** 
	 * 所属行业名称
	 */
	@ApiField("industry_name")
	private String industryName;

	/** 
	 * 职位供应商介绍
	 */
	@ApiField("introduction")
	private String introduction;

	/** 
	 * 岗位信息列表
	 */
	@ApiListField("job_info_list")
	@ApiField("job_info")
	private List<JobInfo> jobInfoList;

	/** 
	 * 职位供应商code
	 */
	@ApiField("job_supplier_code")
	private String jobSupplierCode;

	/** 
	 * 地理位置信息，ISV可根据此信息获取定位展示。各参数含义
longitude：经度；
latitude：纬度；
address_name：定位名称；
address_desc：地址展示名称；
	 */
	@ApiField("location_info")
	private String locationInfo;

	/** 
	 * 职位供应商名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 供应商页面展示相关素材信息
	 */
	@ApiField("page_info")
	private String pageInfo;

	/** 
	 * 岗位供应商状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 供应商类型。
ENTERPRISES：企业；
STORE:门店
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 是否芝麻认证企业
true：是
false：认证不通过或未认证
	 */
	@ApiField("zhima_cert")
	private Boolean zhimaCert;

	/** 
	 * 芝麻认证企业页面url
	 */
	@ApiField("zhima_cert_url")
	private String zhimaCertUrl;

	public void setBasicInfo(String basicInfo) {
		this.basicInfo = basicInfo;
	}
	public String getBasicInfo( ) {
		return this.basicInfo;
	}

	public void setBonusDesc(String bonusDesc) {
		this.bonusDesc = bonusDesc;
	}
	public String getBonusDesc( ) {
		return this.bonusDesc;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getIndustryName( ) {
		return this.industryName;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getIntroduction( ) {
		return this.introduction;
	}

	public void setJobInfoList(List<JobInfo> jobInfoList) {
		this.jobInfoList = jobInfoList;
	}
	public List<JobInfo> getJobInfoList( ) {
		return this.jobInfoList;
	}

	public void setJobSupplierCode(String jobSupplierCode) {
		this.jobSupplierCode = jobSupplierCode;
	}
	public String getJobSupplierCode( ) {
		return this.jobSupplierCode;
	}

	public void setLocationInfo(String locationInfo) {
		this.locationInfo = locationInfo;
	}
	public String getLocationInfo( ) {
		return this.locationInfo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPageInfo(String pageInfo) {
		this.pageInfo = pageInfo;
	}
	public String getPageInfo( ) {
		return this.pageInfo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public void setZhimaCert(Boolean zhimaCert) {
		this.zhimaCert = zhimaCert;
	}
	public Boolean getZhimaCert( ) {
		return this.zhimaCert;
	}

	public void setZhimaCertUrl(String zhimaCertUrl) {
		this.zhimaCertUrl = zhimaCertUrl;
	}
	public String getZhimaCertUrl( ) {
		return this.zhimaCertUrl;
	}

}
