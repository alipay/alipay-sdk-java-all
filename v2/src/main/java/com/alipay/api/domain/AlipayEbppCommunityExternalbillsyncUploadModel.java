package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物业账单批量动账接口
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:29:14
 */
public class AlipayEbppCommunityExternalbillsyncUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1322897113971369227L;

	/**
	 * 小区短名，本接口只支持按小区纬度动账
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 同步对象，最大长度100
	 */
	@ApiListField("external_sync_list")
	@ApiField("external_sync_request")
	private List<ExternalSyncRequest> externalSyncList;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public List<ExternalSyncRequest> getExternalSyncList() {
		return this.externalSyncList;
	}
	public void setExternalSyncList(List<ExternalSyncRequest> externalSyncList) {
		this.externalSyncList = externalSyncList;
	}

}
