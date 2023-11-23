package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给纷享销客的删除商机成员的接口
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:22:02
 */
public class AnttechOceanbaseObglobalLeadsmemberDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3815575474575969167L;

	/**
	 * 提供给分享逍客的删除商机成员的接口的参数
	 */
	@ApiField("fxiaoke_delete_leads_member_request")
	private FxiaokeOperateLeadsMemberParams fxiaokeDeleteLeadsMemberRequest;

	public FxiaokeOperateLeadsMemberParams getFxiaokeDeleteLeadsMemberRequest() {
		return this.fxiaokeDeleteLeadsMemberRequest;
	}
	public void setFxiaokeDeleteLeadsMemberRequest(FxiaokeOperateLeadsMemberParams fxiaokeDeleteLeadsMemberRequest) {
		this.fxiaokeDeleteLeadsMemberRequest = fxiaokeDeleteLeadsMemberRequest;
	}

}
