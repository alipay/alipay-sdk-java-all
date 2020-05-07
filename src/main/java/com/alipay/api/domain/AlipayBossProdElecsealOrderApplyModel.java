package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 法务中台 电子用印请求
 *
 * @author auto create
 * @since 1.0, 2019-12-27 17:47:25
 */
public class AlipayBossProdElecsealOrderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7223269251275785117L;

	/**
	 * 接入法务中台电子应用服务的主体，一般为app名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 请求版本号，由法务中台技术提供值
	 */
	@ApiField("app_version")
	private Long appVersion;

	/**
	 * 业务幂等字段，用于唯一标示一条业务记录
	 */
	@ApiField("business_unique_id")
	private String businessUniqueId;

	/**
	 * 业务方上传到法务中台oss，待进行电子签章的pdf文件地址
	 */
	@ApiField("file_oss_key")
	private String fileOssKey;

	/**
	 * 甲方签约主体信息
	 */
	@ApiField("first_party")
	private AntlawSignOperator firstParty;

	/**
	 * 根据请求值生成的hash值，用于法务中台进行鉴权
	 */
	@ApiField("hash_value")
	private String hashValue;

	/**
	 * 按页定义模式下的用印申请信息，每一页单独定义
	 */
	@ApiListField("seal_page_info_list")
	@ApiField("seal_page_info")
	private List<SealPageInfo> sealPageInfoList;

	/**
	 * 电子用印申请类型，包括按页申请（PAGE_MODE）和统一模式申请(UNIFIED)
	 */
	@ApiField("seal_request_mode")
	private String sealRequestMode;

	/**
	 * 乙方签约企业列表
	 */
	@ApiListField("second_parties")
	@ApiField("antlaw_sign_operator")
	private List<AntlawSignOperator> secondParties;

	/**
	 * 统一模式下需要用印的页码列表
	 */
	@ApiListField("unified_page_index_list")
	@ApiField("number")
	private List<Long> unifiedPageIndexList;

	/**
	 * 统一模式下用印请求信息的定义，需要用印的所有页面都会使用此用印信息
	 */
	@ApiField("unified_seal_request_info")
	private SealRequestInfo unifiedSealRequestInfo;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Long getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(Long appVersion) {
		this.appVersion = appVersion;
	}

	public String getBusinessUniqueId() {
		return this.businessUniqueId;
	}
	public void setBusinessUniqueId(String businessUniqueId) {
		this.businessUniqueId = businessUniqueId;
	}

	public String getFileOssKey() {
		return this.fileOssKey;
	}
	public void setFileOssKey(String fileOssKey) {
		this.fileOssKey = fileOssKey;
	}

	public AntlawSignOperator getFirstParty() {
		return this.firstParty;
	}
	public void setFirstParty(AntlawSignOperator firstParty) {
		this.firstParty = firstParty;
	}

	public String getHashValue() {
		return this.hashValue;
	}
	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}

	public List<SealPageInfo> getSealPageInfoList() {
		return this.sealPageInfoList;
	}
	public void setSealPageInfoList(List<SealPageInfo> sealPageInfoList) {
		this.sealPageInfoList = sealPageInfoList;
	}

	public String getSealRequestMode() {
		return this.sealRequestMode;
	}
	public void setSealRequestMode(String sealRequestMode) {
		this.sealRequestMode = sealRequestMode;
	}

	public List<AntlawSignOperator> getSecondParties() {
		return this.secondParties;
	}
	public void setSecondParties(List<AntlawSignOperator> secondParties) {
		this.secondParties = secondParties;
	}

	public List<Long> getUnifiedPageIndexList() {
		return this.unifiedPageIndexList;
	}
	public void setUnifiedPageIndexList(List<Long> unifiedPageIndexList) {
		this.unifiedPageIndexList = unifiedPageIndexList;
	}

	public SealRequestInfo getUnifiedSealRequestInfo() {
		return this.unifiedSealRequestInfo;
	}
	public void setUnifiedSealRequestInfo(SealRequestInfo unifiedSealRequestInfo) {
		this.unifiedSealRequestInfo = unifiedSealRequestInfo;
	}

}
