package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给纷享销客的创建商机成员的接口
 *
 * @author auto create
 * @since 1.0, 2024-04-07 15:27:52
 */
public class AnttechOceanbaseObglobalLeadsmemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1636319493248258231L;

	/**
	 * 提供给纷享销客的创建商机成员的接口的请求参数
	 */
	@ApiField("fxiaoke_create_leads_member_request")
	private FxiaokeOperateLeadsMemberParams fxiaokeCreateLeadsMemberRequest;

	public FxiaokeOperateLeadsMemberParams getFxiaokeCreateLeadsMemberRequest() {
		return this.fxiaokeCreateLeadsMemberRequest;
	}
	public void setFxiaokeCreateLeadsMemberRequest(FxiaokeOperateLeadsMemberParams fxiaokeCreateLeadsMemberRequest) {
		this.fxiaokeCreateLeadsMemberRequest = fxiaokeCreateLeadsMemberRequest;
	}

}
