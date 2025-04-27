package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据应用OpenId批量获取用户支付宝用户ID
 *
 * @author auto create
 * @since 1.0, 2023-12-28 11:23:51
 */
public class AlipayOpenAppOpenidOpenidtouidBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5321121796425165352L;

	/**
	 * 业务appid参数，用于转换其他appid的openid，需要申请更高执行权限。默认应为空。
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 待查询转换的openid列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

}
