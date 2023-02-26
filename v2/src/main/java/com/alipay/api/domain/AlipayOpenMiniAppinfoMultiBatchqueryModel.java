package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询小程序应用信息
 *
 * @author auto create
 * @since 1.0, 2019-04-11 10:42:46
 */
public class AlipayOpenMiniAppinfoMultiBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5252388326917544235L;

	/**
	 * 客户端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 应用id列表参数，比如[2017010362788004,2017010362788005]
	 */
	@ApiListField("mini_app_id_list")
	@ApiField("string")
	private List<String> miniAppIdList;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public List<String> getMiniAppIdList() {
		return this.miniAppIdList;
	}
	public void setMiniAppIdList(List<String> miniAppIdList) {
		this.miniAppIdList = miniAppIdList;
	}

}
