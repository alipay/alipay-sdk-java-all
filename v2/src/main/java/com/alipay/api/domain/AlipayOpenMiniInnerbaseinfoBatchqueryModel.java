package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内部小程序 - 批量查询信息
 *
 * @author auto create
 * @since 1.0, 2020-04-23 14:18:52
 */
public class AlipayOpenMiniInnerbaseinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1767958221273596569L;

	/**
	 * 租户code，alipay or taobao
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序id列表
	 */
	@ApiListField("mini_app_id_list")
	@ApiField("mini_app_base_info_query_info")
	private List<MiniAppBaseInfoQueryInfo> miniAppIdList;

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public List<MiniAppBaseInfoQueryInfo> getMiniAppIdList() {
		return this.miniAppIdList;
	}
	public void setMiniAppIdList(List<MiniAppBaseInfoQueryInfo> miniAppIdList) {
		this.miniAppIdList = miniAppIdList;
	}

}
