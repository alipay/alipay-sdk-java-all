package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序服务信息批量上传
 *
 * @author auto create
 * @since 1.0, 2020-01-09 18:36:25
 */
public class AlipayOpenMiniBizdataTemplatemessageUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4689667682722392562L;

	/**
	 * 服务信息列表，列表大小不超过50
	 */
	@ApiListField("biz_data_list")
	@ApiField("user_app_biz_data_info")
	private List<UserAppBizDataInfo> bizDataList;

	public List<UserAppBizDataInfo> getBizDataList() {
		return this.bizDataList;
	}
	public void setBizDataList(List<UserAppBizDataInfo> bizDataList) {
		this.bizDataList = bizDataList;
	}

}
