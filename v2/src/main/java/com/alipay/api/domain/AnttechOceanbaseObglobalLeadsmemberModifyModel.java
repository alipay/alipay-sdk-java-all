package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给纷享销客的更新商机成员的接口
 *
 * @author auto create
 * @since 1.0, 2024-04-07 15:28:53
 */
public class AnttechOceanbaseObglobalLeadsmemberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1187126543339983752L;

	/**
	 * 提供给纷享销客的更新商机成员的接口的参数
	 */
	@ApiField("fxiaoke_update_leads_member_request")
	private FxiaokeOperateLeadsMemberParams fxiaokeUpdateLeadsMemberRequest;

	public FxiaokeOperateLeadsMemberParams getFxiaokeUpdateLeadsMemberRequest() {
		return this.fxiaokeUpdateLeadsMemberRequest;
	}
	public void setFxiaokeUpdateLeadsMemberRequest(FxiaokeOperateLeadsMemberParams fxiaokeUpdateLeadsMemberRequest) {
		this.fxiaokeUpdateLeadsMemberRequest = fxiaokeUpdateLeadsMemberRequest;
	}

}
