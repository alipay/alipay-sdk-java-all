package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * boss报价单活动状态变更同步海图报价单活动
 *
 * @author auto create
 * @since 1.0, 2026-06-10 17:32:11
 */
public class AnttechOceanbaseObglobalActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5664536347798936866L;

	/**
	 * 活动信息
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	public String getActivityDesc() {
		return this.activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

}
