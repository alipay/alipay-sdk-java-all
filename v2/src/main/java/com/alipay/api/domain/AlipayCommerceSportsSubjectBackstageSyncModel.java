package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体-视频跟练-同步爱动主题
 *
 * @author auto create
 * @since 1.0, 2025-10-13 13:49:30
 */
public class AlipayCommerceSportsSubjectBackstageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8167552458396394956L;

	/**
	 * 主题列表
	 */
	@ApiField("list")
	private AIDongSubjectSyncDetail list;

	public AIDongSubjectSyncDetail getList() {
		return this.list;
	}
	public void setList(AIDongSubjectSyncDetail list) {
		this.list = list;
	}

}
