package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询公司基本信息列表
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class AlipayBossProdCompanyauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3757791781932624731L;

	/**
	 * 对应云凤蝶表单中填写的appCode
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 公司id查询
	 */
	@ApiField("company_id_list")
	private String companyIdList;

	/**
	 * 公司名精确查询
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司名称模糊查询
	 */
	@ApiField("company_name_fuzzy")
	private String companyNameFuzzy;

	/**
	 * ouCode精准查询
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 传boolean值
	 */
	@ApiField("paging")
	private Boolean paging;

	/**
	 * 对应云凤蝶表单中填写的场景
前面这个字符串
	 */
	@ApiField("usage_scene")
	private String usageScene;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getCompanyIdList() {
		return this.companyIdList;
	}
	public void setCompanyIdList(String companyIdList) {
		this.companyIdList = companyIdList;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNameFuzzy() {
		return this.companyNameFuzzy;
	}
	public void setCompanyNameFuzzy(String companyNameFuzzy) {
		this.companyNameFuzzy = companyNameFuzzy;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getPaging() {
		return this.paging;
	}
	public void setPaging(Boolean paging) {
		this.paging = paging;
	}

	public String getUsageScene() {
		return this.usageScene;
	}
	public void setUsageScene(String usageScene) {
		this.usageScene = usageScene;
	}

}
