package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流驿站小程序激励政策验收接口
 *
 * @author auto create
 * @since 1.0, 2023-06-25 19:03:52
 */
public class AlipayCommerceLogisticsCheckPostpolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2558883613374619862L;

	/**
	 * app_id_list是名下需要验收的小程序id列表，可从O站获取
	 */
	@ApiListField("app_id_list")
	@ApiField("string")
	private List<String> appIdList;

	public List<String> getAppIdList() {
		return this.appIdList;
	}
	public void setAppIdList(List<String> appIdList) {
		this.appIdList = appIdList;
	}

}
