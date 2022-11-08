package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SearchBoxAccountModule;
import com.alipay.api.domain.SearchBoxBasicInfoModule;
import com.alipay.api.domain.SearchBoxKeyWordModule;
import com.alipay.api.domain.SearchBoxImageModule;
import com.alipay.api.domain.SearchBoxServiceModule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.box.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-09 11:06:52
 */
public class AlipayOpenSearchBoxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6383193845478556433L;

	/** 
	 * 搜索直达账号模块
	 */
	@ApiField("account_module")
	private SearchBoxAccountModule accountModule;

	/** 
	 * 搜索直达基础信息模块
	 */
	@ApiField("basic_info_module")
	private SearchBoxBasicInfoModule basicInfoModule;

	/** 
	 * 搜索直达配置id
	 */
	@ApiField("box_id")
	private String boxId;

	/** 
	 * 搜索直达配置状态，AUDIT-审核中/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架
	 */
	@ApiField("box_status")
	private String boxStatus;

	/** 
	 * 搜索直达默认触发词，由系统生成，无法修改
	 */
	@ApiListField("default_keywords")
	@ApiField("string")
	private List<String> defaultKeywords;

	/** 
	 * 搜索直达关键词模块
	 */
	@ApiField("keyword_module")
	private SearchBoxKeyWordModule keywordModule;

	/** 
	 * 最近一次审核氛围图
	 */
	@ApiField("latest_audit_image")
	private SearchBoxImageModule latestAuditImage;

	/** 
	 * 搜索直达服务模块
	 */
	@ApiField("service_module")
	private SearchBoxServiceModule serviceModule;

	/** 
	 * 已生效氛围图
	 */
	@ApiField("valid_image")
	private SearchBoxImageModule validImage;

	public void setAccountModule(SearchBoxAccountModule accountModule) {
		this.accountModule = accountModule;
	}
	public SearchBoxAccountModule getAccountModule( ) {
		return this.accountModule;
	}

	public void setBasicInfoModule(SearchBoxBasicInfoModule basicInfoModule) {
		this.basicInfoModule = basicInfoModule;
	}
	public SearchBoxBasicInfoModule getBasicInfoModule( ) {
		return this.basicInfoModule;
	}

	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}
	public String getBoxId( ) {
		return this.boxId;
	}

	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}
	public String getBoxStatus( ) {
		return this.boxStatus;
	}

	public void setDefaultKeywords(List<String> defaultKeywords) {
		this.defaultKeywords = defaultKeywords;
	}
	public List<String> getDefaultKeywords( ) {
		return this.defaultKeywords;
	}

	public void setKeywordModule(SearchBoxKeyWordModule keywordModule) {
		this.keywordModule = keywordModule;
	}
	public SearchBoxKeyWordModule getKeywordModule( ) {
		return this.keywordModule;
	}

	public void setLatestAuditImage(SearchBoxImageModule latestAuditImage) {
		this.latestAuditImage = latestAuditImage;
	}
	public SearchBoxImageModule getLatestAuditImage( ) {
		return this.latestAuditImage;
	}

	public void setServiceModule(SearchBoxServiceModule serviceModule) {
		this.serviceModule = serviceModule;
	}
	public SearchBoxServiceModule getServiceModule( ) {
		return this.serviceModule;
	}

	public void setValidImage(SearchBoxImageModule validImage) {
		this.validImage = validImage;
	}
	public SearchBoxImageModule getValidImage( ) {
		return this.validImage;
	}

}
