package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubCloudUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.subuserinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbcloudSubuserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2164527429112934767L;

	/** 
	 * 口碑子账号数据列表
	 */
	@ApiListField("sub_cloud_user_list")
	@ApiField("sub_cloud_user_info")
	private List<SubCloudUserInfo> subCloudUserList;

	public void setSubCloudUserList(List<SubCloudUserInfo> subCloudUserList) {
		this.subCloudUserList = subCloudUserList;
	}
	public List<SubCloudUserInfo> getSubCloudUserList( ) {
		return this.subCloudUserList;
	}

}
