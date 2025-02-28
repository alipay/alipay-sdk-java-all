package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 准入校验
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:59:17
 */
public class AccessCheckInfo extends AlipayObject {

	private static final long serialVersionUID = 4313274651843289685L;

	/**
	 * 校验结果
	 */
	@ApiField("access_check")
	private Boolean accessCheck;

	/**
	 * 每一项规则校验结果
	 */
	@ApiListField("check_item_info_list")
	@ApiField("access_check_item_info")
	private List<AccessCheckItemInfo> checkItemInfoList;

	public Boolean getAccessCheck() {
		return this.accessCheck;
	}
	public void setAccessCheck(Boolean accessCheck) {
		this.accessCheck = accessCheck;
	}

	public List<AccessCheckItemInfo> getCheckItemInfoList() {
		return this.checkItemInfoList;
	}
	public void setCheckItemInfoList(List<AccessCheckItemInfo> checkItemInfoList) {
		this.checkItemInfoList = checkItemInfoList;
	}

}
