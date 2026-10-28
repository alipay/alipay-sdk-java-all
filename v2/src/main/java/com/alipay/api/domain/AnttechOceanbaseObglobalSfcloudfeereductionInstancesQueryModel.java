package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Salesforce代金券可抵扣实例候选查询
 *
 * @author auto create
 * @since 1.0, 2026-10-20 14:42:55
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionInstancesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1448814729935434368L;

	/**
	 * 实例ID模糊搜索词，可不传；空白按不筛选处理
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 商机编码，取Salesforce当前Opportunity记录的Opportunity_Code__c字段；须先将商机同步海图，不能使用SF记录ID代替。
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * 官网UID，允许DO/OS前缀，必须属于商机客户
	 */
	@ApiField("ob_passport_id")
	private String obPassportId;

	/**
	 * 站点（国内站/国际站）
	 */
	@ApiField("region")
	private String region;

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getObPassportId() {
		return this.obPassportId;
	}
	public void setObPassportId(String obPassportId) {
		this.obPassportId = obPassportId;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
