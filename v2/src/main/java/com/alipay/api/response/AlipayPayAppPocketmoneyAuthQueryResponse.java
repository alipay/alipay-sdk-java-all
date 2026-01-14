package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WatchAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.pocketmoney.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 20:27:37
 */
public class AlipayPayAppPocketmoneyAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7749525328386611413L;

	/** 
	 * app信息
	 */
	@ApiListField("app_infos")
	@ApiField("watch_app_info")
	private List<WatchAppInfo> appInfos;

	/** 
	 * 授权结果，枚举值（ok：授权成功，exist：已经存在）
	 */
	@ApiField("auth_result")
	private String authResult;

	/** 
	 * 零花钱ID
	 */
	@ApiField("change_code_id")
	private String changeCodeId;

	/** 
	 * 厂商家长ID
	 */
	@ApiField("vendor_parent_id")
	private String vendorParentId;

	public void setAppInfos(List<WatchAppInfo> appInfos) {
		this.appInfos = appInfos;
	}
	public List<WatchAppInfo> getAppInfos( ) {
		return this.appInfos;
	}

	public void setAuthResult(String authResult) {
		this.authResult = authResult;
	}
	public String getAuthResult( ) {
		return this.authResult;
	}

	public void setChangeCodeId(String changeCodeId) {
		this.changeCodeId = changeCodeId;
	}
	public String getChangeCodeId( ) {
		return this.changeCodeId;
	}

	public void setVendorParentId(String vendorParentId) {
		this.vendorParentId = vendorParentId;
	}
	public String getVendorParentId( ) {
		return this.vendorParentId;
	}

}
