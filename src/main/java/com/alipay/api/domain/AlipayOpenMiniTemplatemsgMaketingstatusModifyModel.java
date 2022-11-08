package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序模板消息营销投放详情状态修改
 *
 * @author auto create
 * @since 1.0, 2022-09-26 14:14:12
 */
public class AlipayOpenMiniTemplatemsgMaketingstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3729565374449724667L;

	/**
	 * 营销投放详情id
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 投放详情状态值，如：INIT:下线状态，ON_LINE:上线状态，DELETED:删除状态
	 */
	@ApiField("status")
	private String status;

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
