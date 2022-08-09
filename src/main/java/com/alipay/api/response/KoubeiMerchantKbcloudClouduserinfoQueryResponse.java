package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CloudUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.clouduserinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 22:34:20
 */
public class KoubeiMerchantKbcloudClouduserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7361558373158821858L;

	/** 
	 * 口碑云主账号数据列表
	 */
	@ApiListField("cloud_user_list")
	@ApiField("cloud_user_info")
	private List<CloudUserInfo> cloudUserList;

	public void setCloudUserList(List<CloudUserInfo> cloudUserList) {
		this.cloudUserList = cloudUserList;
	}
	public List<CloudUserInfo> getCloudUserList( ) {
		return this.cloudUserList;
	}

}
